package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add() {

        int a = 10;
        int b = 20;

        return "Sum = " + (a + b);
    }
}
