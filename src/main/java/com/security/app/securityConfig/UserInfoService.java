package com.security.app.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
       //at the singup time role will be ROLE_USER
        userInfo.setRoles("ROLE_USER");
        userInfoRepository.save(userInfo);
        return "user created ";
    }

    public List<UserInfo> getUserInfolist() {
        return userInfoRepository.findAll();
    }
}
