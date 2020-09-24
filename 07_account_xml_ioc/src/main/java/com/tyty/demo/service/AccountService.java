package com.tyty.demo.service;

/**
 * Created by TYTY on 2020/9/24 21:41
 */

import com.tyty.demo.domin.Account;

import java.util.List;

/**
 * 账户的业务接口
 */
public interface AccountService {

    /**
     * 查询所有
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);
}
