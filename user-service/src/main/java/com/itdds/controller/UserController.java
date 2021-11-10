package com.itdds.controller;

import com.itdds.mapper.UserMapper;
import com.itdds.pojo.User;
import com.itdds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable long id){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user= userService.findById(id);
        return user;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
