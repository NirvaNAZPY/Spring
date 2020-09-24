package com.tyty.demo.service.Impl;

import com.tyty.demo.dao.AccountDao;
import com.tyty.demo.domin.Account;
import com.tyty.demo.service.AccountService;

import java.util.List;

/**
 * Created by TYTY on 2020/9/24 21:42
 */

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
