package ru.puppeteers.sharecode.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.puppeteers.sharecode.api.response.FormatResponse;
import ru.puppeteers.sharecode.service.FormatService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/format")
@RequiredArgsConstructor
public class FormatController {

    private final FormatService formatService;

    @GetMapping("/all")
    public List<FormatResponse> getAll() {
        return formatService.getAll();
    }
}
