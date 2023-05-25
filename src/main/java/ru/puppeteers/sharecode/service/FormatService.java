package ru.puppeteers.sharecode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.puppeteers.sharecode.api.response.FormatResponse;
import ru.puppeteers.sharecode.mapper.FormatMapper;
import ru.puppeteers.sharecode.repository.FormatRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormatService {

    private final FormatRepository formatRepository;
    private final FormatMapper formatMapper;

    @Cacheable(cacheNames = "formats")
    public List<FormatResponse> getAll() {
        return formatRepository.findAll().stream().map(formatMapper::toResponse).toList();
    }
}
