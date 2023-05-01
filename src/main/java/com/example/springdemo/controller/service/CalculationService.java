package com.example.springdemo.controller.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class CalculationService {
    public Integer sum(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException();
        }
        return a + b;
    }
}
