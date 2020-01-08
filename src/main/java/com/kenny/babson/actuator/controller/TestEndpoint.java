package com.kenny.babson.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/message")
public class TestEndpoint {

    @GetMapping
    public String getMessage(){
        return "Gain java knowledge";
    }
}
