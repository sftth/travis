package com.summit.travis.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/cal")
    public String init() {
        return "Calculator is being constructed.";
    }
}
