package com.tyty.demo.factory;

import com.tyty.demo.service.AccountService;
import com.tyty.demo.service.Impl.AccountServiceImpl;

/**
 * Created by TYTY on 2020/9/19 21:47
 * 模拟一个工厂类（可能是存在与jar包中的，我们无法通过修改源码的方式来提供默认构造函数）
 */

public class StaticFactory {

    public static AccountService getAccountService(){
        return new AccountServiceImpl();
    }

}