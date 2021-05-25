package com.example.limitservice.service;

import com.example.limitservice.config.Configuration;
import com.example.limitservice.domain.Limit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LimitService {

    private final Configuration configuration;

    public Limit retrieveLimits() {
        return Limit.builder()
                .minimum(configuration.getMinimum())
                .maximum(configuration.getMaximum())
                .build();
    }
}
