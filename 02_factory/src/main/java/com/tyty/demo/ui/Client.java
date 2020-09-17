package com.tyty.demo.ui;

/**
 * Created by TYTY on 2020/9/17 20:59
 */

import com.tyty.demo.fuctory.BeanFuctory;
import com.tyty.demo.service.AccountService;
import com.tyty.demo.service.Impl.AccountServiceImpl;

/**
 * 模拟一个表现层,用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        // 使用new的方式
        // AccountService as = new AccountServiceImpl();
        // as.saveAccount();

        // 使用fuctory方式
        // AccountService as = (AccountService) BeanFuctory.getBean("accountService");
        // as.saveAccount();

        for(int i = 0; i < 5; i++){
            AccountService as = (AccountService) BeanFuctory.getBean("accountService");
            System.out.println(as);
        }
    }
}
