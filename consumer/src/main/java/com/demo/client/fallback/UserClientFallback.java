package com.demo.client.fallback;

import com.demo.client.UserClient;
import com.demo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public User getUserById(long id) {
        User user=new User();
        user.setId(id);
        return user;
    }
}
