package ru.puppeteers.sharecode.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasteResponse {

    private UUID id;
    private String data;
    private FormatResponse format;
    private LocalDateTime creationDate;
    private LocalDateTime expireDate;
}
