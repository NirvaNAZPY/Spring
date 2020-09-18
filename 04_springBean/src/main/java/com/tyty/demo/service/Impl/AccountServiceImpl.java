package com.tyty.demo.service.Impl;

import com.tyty.demo.dao.AccountDao;
import com.tyty.demo.dao.Impl.AccountDaoImpl;
import com.tyty.demo.service.AccountService;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl implements AccountService{

    // 注意本案例的这里,并没有使用ApplicationContext创建的对象
    private AccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
