package com.mytestp.testp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
    
    @RequestMapping("/")
    public String hello(){
        return "Hello world";
    }
}
