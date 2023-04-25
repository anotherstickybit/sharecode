package ru.puppeteers.sharecode.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasteCreateRequest {

    private String data;
    private Integer formatTypeId;
    private LocalDateTime expireDate;
}
