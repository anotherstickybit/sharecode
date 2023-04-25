package ru.puppeteers.sharecode.api.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PasteFormatEnum {

    PLAIN_TEXT(1),
    JAVA(2),
    JAVASCRIPT(3);

    private final Integer id;
}
