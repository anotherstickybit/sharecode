package ru.puppeteers.sharecode.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.puppeteers.sharecode.api.request.PasteCreateRequest;
import ru.puppeteers.sharecode.api.response.PasteResponse;
import ru.puppeteers.sharecode.service.PasteService;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/paste")
@RequiredArgsConstructor
public class PasteController {
    private final PasteService pasteService;


    @GetMapping("/{id}")
    public PasteResponse getPasteById(@PathVariable String id) {
        return pasteService.findById(UUID.fromString(id));
    }

    @PostMapping("/new")
    public PasteResponse create(@RequestBody PasteCreateRequest request) {
        return pasteService.create(request);
    }
}
