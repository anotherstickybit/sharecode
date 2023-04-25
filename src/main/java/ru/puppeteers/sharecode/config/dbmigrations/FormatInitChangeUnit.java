package ru.puppeteers.sharecode.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import ru.puppeteers.sharecode.entity.FormatEntity;
import ru.puppeteers.sharecode.repository.FormatRepository;

@ChangeLog(order = "001")
public class FormatInitChangelog {

    @ChangeSet(order = "001", id = "init_formats", author = "maratsadykov")
    public void initFormats(FormatRepository formatRepository) {
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
}
