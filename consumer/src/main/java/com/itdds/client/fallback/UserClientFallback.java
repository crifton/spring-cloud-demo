package com.itdds.client.fallback;

import com.itdds.client.UserClient;
import com.itdds.pojo.User;
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
