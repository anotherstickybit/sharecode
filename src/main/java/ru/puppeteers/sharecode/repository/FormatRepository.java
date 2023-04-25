package ru.puppeteers.sharecode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.puppeteers.sharecode.entity.FormatEntity;

@Repository
public interface FormatRepository extends MongoRepository<FormatEntity, Integer> {
}
