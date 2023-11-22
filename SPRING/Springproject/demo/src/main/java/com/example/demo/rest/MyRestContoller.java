package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestContoller {
    @Value("${trupti.name}")
    private String name;
    @GetMapping("/hii")
    public String display(){
        return "hello i m trupti"+name;
    }
}
