package com.tyty.demo.dao.Impl;

import com.tyty.demo.dao.AccountDao;
import org.springframework.stereotype.Component;

/**
 * Created by TYTY on 2020/9/17 20:40
 */

@Component
public class AccountDaoImpl1 implements AccountDao {
    public void saveAccount() {
        System.out.println("保存了账户1");
    }
}
