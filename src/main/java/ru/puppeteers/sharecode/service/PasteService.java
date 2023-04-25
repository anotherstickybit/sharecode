package ru.puppeteers.sharecode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.puppeteers.sharecode.api.request.PasteCreateRequest;
import ru.puppeteers.sharecode.api.response.PasteResponse;
import ru.puppeteers.sharecode.entity.PasteEntity;
import ru.puppeteers.sharecode.mapper.PasteMapper;
import ru.puppeteers.sharecode.repository.PasteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PasteService {

    private final PasteRepository pasteRepository;
    private final PasteMapper pasteMapper;

    public List<PasteResponse> getAll() {
        return pasteRepository.findAll().stream().map(pasteMapper::toResponse).toList();
    }

    public PasteResponse create(PasteCreateRequest request) {
        PasteEntity entity = pasteMapper.toEntity(request);
        PasteEntity saved = pasteRepository.save(entity);

        return pasteMapper.toResponse(saved);
    }

}
