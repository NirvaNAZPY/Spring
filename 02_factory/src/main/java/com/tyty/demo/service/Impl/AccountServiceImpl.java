package com.tyty.demo.service.Impl;

import com.tyty.demo.dao.AccountDaoService;
import com.tyty.demo.dao.Impl.AccountDaoServiceServiceImpl;
import com.tyty.demo.domain.Account;
import com.tyty.demo.fuctory.BeanFuctory;
import com.tyty.demo.service.AccountService;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl implements AccountService{

    // private AccountDaoService accountDaoService = new AccountDaoServiceServiceImpl();
    AccountDaoService accountDaoService = (AccountDaoService) BeanFuctory.getBean("accountDao");

    public void saveAccount() {
        accountDaoService.saveAccount();
    }
}
