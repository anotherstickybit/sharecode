package ru.puppeteers.sharecode.mapper;

import lombok.Getter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import ru.puppeteers.sharecode.api.request.PasteCreateRequest;
import ru.puppeteers.sharecode.api.response.PasteResponse;
import ru.puppeteers.sharecode.entity.PasteEntity;
import ru.puppeteers.sharecode.repository.FormatRepository;

@Getter
@Mapper(componentModel = "spring")
public abstract class PasteMapper {

    @Autowired
    private FormatRepository formatRepository;

    @Mapping(target = "data", source = "data")
    @Mapping(target = "format",
            expression = "java(getFormatRepository().findById(request.getFormatTypeId()).orElseThrow())")
    public abstract PasteEntity toEntity(PasteCreateRequest request);

    public abstract PasteResponse toResponse(PasteEntity entity);
}
