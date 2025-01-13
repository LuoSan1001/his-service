package com.icase.controller;

import com.icase.pojo.User;
import com.icase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        User loginUser = userService.login(user);
        if (loginUser == null) {
            return "fail";
        } else {
            return "success";
        }
    }

    @PostMapping("/api/user")
    public String register(@RequestBody User user) {
        if (userService.register(user) == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @PutMapping("/api/user")
    public String update(@RequestBody User user) {
        if (userService.update(user) != null) {
            return "success";
        } else {
            return "fail";
        }
    }
}
