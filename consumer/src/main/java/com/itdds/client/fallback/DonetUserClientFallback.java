package com.itdds.client.fallback;

import com.itdds.client.DonetUserClient;
import com.itdds.client.UserClient;
import com.itdds.pojo.DonetUser;
import com.itdds.pojo.User;
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
