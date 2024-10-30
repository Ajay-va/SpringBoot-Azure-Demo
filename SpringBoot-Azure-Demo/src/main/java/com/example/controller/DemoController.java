package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class DemoController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Azure Tutorials....!!! Ajay Varma Javvaji";
    }


}
