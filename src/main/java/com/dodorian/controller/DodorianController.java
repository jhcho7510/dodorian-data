package com.dodorian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DodorianController {
    @GetMapping("/sample")
    public void sample() {
        System.out.println(":::: Dodorian ::::");
    }
}
