package com.tyty.demo.dao.Impl;

import com.tyty.demo.dao.AccountDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by TYTY on 2020/9/23 20:11
 */

@Repository
public class AccountDaoImpl2 implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户2");
    }
}
