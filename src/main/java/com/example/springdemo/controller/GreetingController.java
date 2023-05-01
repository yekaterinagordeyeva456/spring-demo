package com.example.springdemo.controller;

import com.example.springdemo.controller.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helo")
public class GreetingController {
    private CalculationService calculationService;

    @Autowired
    public GreetingController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping
    public Integer sum(@RequestParam Integer num1, @RequestParam(required = false) Integer num2) {
        return calculationService.sum(num1, num2);
    }
}
