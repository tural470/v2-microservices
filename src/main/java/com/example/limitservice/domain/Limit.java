package com.example.limitservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Limit {
    private int minimum;
    private int maximum;
}
