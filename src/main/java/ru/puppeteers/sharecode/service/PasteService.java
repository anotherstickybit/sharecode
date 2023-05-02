package ru.puppeteers.sharecode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.puppeteers.sharecode.api.request.PasteCreateRequest;
import ru.puppeteers.sharecode.api.response.PasteResponse;
import ru.puppeteers.sharecode.entity.PasteEntity;
import ru.puppeteers.sharecode.mapper.PasteMapper;
import ru.puppeteers.sharecode.repository.PasteRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PasteService {

    private final PasteRepository pasteRepository;
    private final PasteMapper pasteMapper;

    public List<PasteResponse> getAll() {
        return pasteRepository.findAll().stream().map(pasteMapper::toResponse).toList();
    }

    public PasteResponse findById(UUID id) {
        return pasteRepository.findById(id).map(pasteMapper::toResponse).orElseThrow();
    }

    public PasteResponse create(PasteCreateRequest request) {
        PasteEntity entity = pasteMapper.toEntity(request);
        PasteEntity saved = pasteRepository.save(entity);

        return pasteMapper.toResponse(saved);
    }

}
