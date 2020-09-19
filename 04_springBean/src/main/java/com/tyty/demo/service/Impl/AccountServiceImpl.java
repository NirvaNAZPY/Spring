package com.tyty.demo.service.Impl;

import com.tyty.demo.service.AccountService;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl implements AccountService{

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }

    public void init(){
        System.out.println("对象初始化");
    }

    public void destory(){
        System.out.println("对象销毁");
    }
}
