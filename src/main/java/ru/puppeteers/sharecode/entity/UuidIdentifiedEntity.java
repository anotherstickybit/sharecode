package ru.puppeteers.sharecode.entity;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public abstract class UuidIdentifiedEntity {

    @MongoId
    protected UUID id;
    protected LocalDateTime creationDate;

    public void setId(UUID id) {

        if (this.id != null) {
            throw new UnsupportedOperationException("ID is already defined");
        }

        this.id = id;
    }

    public void setCreatedDate(LocalDateTime dateTime) {

        if (this.creationDate != null) {
            throw new UnsupportedOperationException("CreatedDate is already defined");
        }

        this.creationDate = dateTime;
    }
}
