package ru.puppeteers.sharecode.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.puppeteers.sharecode.api.response.FormatResponse;
import ru.puppeteers.sharecode.entity.FormatEntity;

@Mapper(componentModel = "spring")
public interface FormatMapper {

    @Mapping(target = "formatType", source = "formatType")
    FormatResponse toResponse(FormatEntity entity);
}
