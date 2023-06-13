package com.demo.client.fallback;

import com.demo.client.DonetUserClient;
import com.demo.pojo.DonetUser;
import org.springframework.stereotype.Component;

@Component
public class DonetUserClientFallback implements DonetUserClient {
    @Override
    public DonetUser getUserById(long id) {
        DonetUser user=new DonetUser();
        user.setUserId(0);
        return user;
    }
}
