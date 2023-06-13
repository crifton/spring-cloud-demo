package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public User findById(long id){
        User user=new User();
        user.setId(id);
        return mapper.selectOne(user);
    }
}
