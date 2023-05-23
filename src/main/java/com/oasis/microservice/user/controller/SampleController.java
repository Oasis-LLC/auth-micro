package com.oasis.microservice.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }
}
