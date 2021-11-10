package com.itdds.client;

import com.itdds.client.fallback.DonetUserClientFallback;
import com.itdds.pojo.DonetUser;
import com.itdds.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "donet-service",fallback = DonetUserClientFallback.class)
public interface DonetUserClient {

    @GetMapping("/api/user/{id}")
    DonetUser getUserById(@PathVariable long id);
}
