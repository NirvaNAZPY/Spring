package com.tyty.demo.service.Impl;

import com.tyty.demo.service.AccountService;

import java.util.Date;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;

    // 经常变化的数据,不适用于注入的方式
    public AccountServiceImpl(String name, Integer age, Date birthday){
        this.name = name;
        this.age = age;
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
