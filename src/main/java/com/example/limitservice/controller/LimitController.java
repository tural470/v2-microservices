package com.example.limitservice.controller;

import com.example.limitservice.domain.Limit;
import com.example.limitservice.service.LimitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("limits")
@RequiredArgsConstructor
public class LimitController {

    private final LimitService limitService;

    @GetMapping
    public Limit retrieveLimits() {
        log.debug("/limits");
        return limitService.retrieveLimits();
    }
}
