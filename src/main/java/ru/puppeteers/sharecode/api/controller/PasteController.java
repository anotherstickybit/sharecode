package ru.puppeteers.sharecode.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.puppeteers.sharecode.api.request.PasteCreateRequest;
import ru.puppeteers.sharecode.api.response.PasteResponse;
import ru.puppeteers.sharecode.service.PasteService;

@RestController
@RequestMapping("/paste")
@RequiredArgsConstructor
public class PasteController {
    private final PasteService pasteService;

    @PostMapping("/new")
    public PasteResponse create(@RequestBody PasteCreateRequest request) {
        return pasteService.create(request);
    }
}
