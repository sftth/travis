package com.summit.travis.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CalculatorController {
    @GetMapping("/cal")
    public String init() {
        String returnStr = "Calculator";
        return returnStr ;
    }

    @GetMapping("/login")
    public String login() {
        return "Login page";
    }
}
