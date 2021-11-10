package com.itdds.controller;


import com.itdds.client.DonetUserClient;
import com.itdds.client.UserClient;
import com.itdds.pojo.DonetUser;
import com.itdds.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
