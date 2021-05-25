package com.example.limitservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit")
@Data
public class Configuration {
    private int minimum;
    private int maximum;
}
