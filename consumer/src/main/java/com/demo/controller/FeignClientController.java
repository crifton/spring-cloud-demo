package com.demo.controller;


import com.demo.client.DonetUserClient;
import com.demo.client.UserClient;
import com.demo.pojo.DonetUser;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fc")
public class FeignClientController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private DonetUserClient donetUserClient;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return userClient.getUserById(id);
    }

    @GetMapping("/donet/{id}")
    public DonetUser getDonetUser(@PathVariable int id){
        return donetUserClient.getUserById(id);
    }
}
