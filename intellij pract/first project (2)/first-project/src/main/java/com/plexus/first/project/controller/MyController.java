package com.plexus.first.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping

    public String dashboard(){
        return "Hello from siddhi";

    }
}
