package ru.puppeteers.sharecode.config;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import ru.puppeteers.sharecode.entity.UuidIdentifiedEntity;

import java.util.UUID;

public class UuidIdentifiedEntityEventListener extends AbstractMongoEventListener<UuidIdentifiedEntity> {

    @Override
    public void onBeforeConvert(BeforeConvertEvent<UuidIdentifiedEntity> event) {
        super.onBeforeConvert(event);
        UuidIdentifiedEntity entity = event.getSource();

        if (entity.getId() == null) {
            entity.setId(UUID.randomUUID());
        }
    }
}
