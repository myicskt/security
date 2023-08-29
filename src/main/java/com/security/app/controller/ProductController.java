package com.security.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")

public class ProductController {
    @GetMapping("/")
    public String getAllProduct(){
        return "hello thei is the product ";
    }
}
