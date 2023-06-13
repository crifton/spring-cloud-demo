package com.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "defaultFallBack")
@Slf4j
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
//    @HystrixCommand
    public String getUser(@PathVariable long id) throws InterruptedException {
//        String url="http://localhost:9091/user/"+id;
//        List<ServiceInstance> instances  = discoveryClient.getInstances("user-service");
//        ServiceInstance ins = instances.get(0);
//        String url="http://"+ins.getHost()+":"+ins.getPort()+"/user/"+id;
//        System.out.println(url);

        if(id==1){
            throw new RuntimeException("系统出异常了");
        }

        String url="http://user-service/user/" + id;
        return restTemplate.getForObject(url,String.class);
    }

    @GetMapping("/donet/{id}")
    public String getDonetUser(@PathVariable int id){
       String url="http://donet-service/api/user/"+id;
       return restTemplate.getForObject(url,String.class);

    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    public String defaultFallBack(){
        log.error("查询信息失败");
        return "系统繁忙，请稍后再试";
    }
}
