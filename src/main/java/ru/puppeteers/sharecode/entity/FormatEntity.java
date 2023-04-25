package ru.puppeteers.sharecode.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("format")
public class FormatEntity {

    @Id
    private ObjectId id;
    private String formatType;
}
