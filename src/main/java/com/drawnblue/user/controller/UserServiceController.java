package com.drawnblue.user.controller;

import com.drawnblue.entity.User;
import com.drawnblue.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @Autowired
    private UserService userService;

    @GetMapping("/userService/findById/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userService.selectById(id);
        return user;
    }
}
