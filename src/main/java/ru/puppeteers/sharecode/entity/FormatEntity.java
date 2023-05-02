package ru.puppeteers.sharecode.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("format")
public class FormatEntity {

    @MongoId
    private ObjectId id;
    private String formatType;
}
