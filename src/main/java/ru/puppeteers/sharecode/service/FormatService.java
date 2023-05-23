package ru.puppeteers.sharecode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
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
    @Autowired
    private final CacheManager cacheManager;

    @Cacheable(cacheNames = "formats")
    public List<FormatResponse> getAll() {
        return formatRepository.findAll().stream().map(formatMapper::toResponse).toList();
    }
 //вроде как надо добавить 2й вариант метода и еще добавить еще один гетмаппер . пытался понять как работает.
    // в примере на гитхабе там было 2 метода в сервисе и 2 маппера.
    // public List<FormatResponse> getAll2() {
    //        if(cacheManager.getCache("formats2").get(customerId) != null) {
    //            return cacheManager.getCache("formats2").get(???).get().toString();
    //        }
    //
    //        cacheManager.getCache("formats2").put(??, ??);
    //
    //        return ??;
    //    }



}
