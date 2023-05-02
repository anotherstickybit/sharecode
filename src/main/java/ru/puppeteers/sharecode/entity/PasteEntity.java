package ru.puppeteers.sharecode.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("paste")
public class PasteEntity extends UuidIdentifiedEntity {

    private String data;
    private FormatEntity format;
    private LocalDateTime expireDate;
}
