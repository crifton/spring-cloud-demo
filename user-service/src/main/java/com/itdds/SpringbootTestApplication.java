package com.itdds;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.itdds.mapper")//注意包扫描的命名空间引用
public class SpringbootTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }
}
