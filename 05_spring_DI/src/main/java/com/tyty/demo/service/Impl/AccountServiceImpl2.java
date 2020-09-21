package com.tyty.demo.service.Impl;

import com.tyty.demo.service.AccountService;

import java.util.Date;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl2 implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("{\"AccountServiceImpl\":{"
                + "\"name\":\""
                + name + '\"'
                + ",\"age\":"
                + age
                + ",\"birthday\":\""
                + birthday + '\"'
                + "}}");
    }
}
