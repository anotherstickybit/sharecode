package ru.puppeteers.sharecode.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.puppeteers.sharecode.api.request.FormatResponse;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasteCreateResponse {

    private UUID id;
    private String data;
    private FormatResponse format;
    private LocalDateTime createDate;
    private LocalDateTime expireDate;
}
