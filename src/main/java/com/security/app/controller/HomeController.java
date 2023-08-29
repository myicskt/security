package com.security.app.controller;

import com.security.app.securityConfig.UserInfo;
import com.security.app.securityConfig.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")

public class HomeController {


    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/home/")
    public String getAllProduct(){
        return "welcome to home";
    }
// http://localhost:8080/api/createuser
    @PostMapping("/createuser/")
    public String addUser(@RequestBody  UserInfo  userInfo ){
        System.out.println(userInfo);
        return userInfoService.addUser(userInfo);
    }

    //just for debuging
    @GetMapping("/homeuser/")
    public List<UserInfo> getAllUser(){
        return userInfoService.getUserInfolist();
    }

}
