package com.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class DonetUser {
    private int userId;
    private String username;
    private String password;
    private Date birthDay;
    private int age;
}
