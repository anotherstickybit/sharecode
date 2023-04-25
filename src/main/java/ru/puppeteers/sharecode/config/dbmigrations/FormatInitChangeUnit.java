package ru.puppeteers.sharecode.config.dbmigrations;

import io.mongock.api.annotations.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import ru.puppeteers.sharecode.entity.FormatEntity;
import ru.puppeteers.sharecode.repository.FormatRepository;

@ChangeUnit(id = "init_format", order = "1", author = "maratsadykov")
public class FormatInitChangeUnit {

    @BeforeExecution
    public void beforeExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.createCollection("format");
    }

    @RollbackBeforeExecution
    public void rollbackBeforeExecution(MongoTemplate mongoTemplate) {
        mongoTemplate.dropCollection("format");
    }

    @Execution
    public void execution(FormatRepository formatRepository) {
        formatRepository.save(FormatEntity.builder()
                .formatType("Plain Text")
                .build());
        formatRepository.save(FormatEntity.builder()
                .formatType("Java")
                .build());
        formatRepository.save(FormatEntity.builder()
                .formatType("JavaScript")
                .build());
    }

    @RollbackExecution
    public void rollbackExecution(FormatRepository formatRepository) {
        formatRepository.deleteAll();
    }
}
