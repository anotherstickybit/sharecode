package ru.puppeteers.sharecode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.puppeteers.sharecode.entity.PasteEntity;

import java.util.UUID;

@Repository
public interface PasteRepository extends MongoRepository<PasteEntity, UUID> {
}
