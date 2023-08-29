package com.security.app.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")

public class UserController {
    @GetMapping("/")
   // @PreAuthorize("hasAuthority('ROLE_USER')")
    public String getAllProduct(){
        return "this is user";
    }
}
