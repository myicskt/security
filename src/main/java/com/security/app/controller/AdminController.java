package com.security.app.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")

public class AdminController {
    @GetMapping("/")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getAllProduct(){
        return "welcome to admin ";
    }
}
