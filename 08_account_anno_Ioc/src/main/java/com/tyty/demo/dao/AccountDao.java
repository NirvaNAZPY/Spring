package com.tyty.demo.dao;

import com.tyty.demo.domin.Account;

import java.util.List;

/**
 * Created by TYTY on 2020/9/24 21:54
 */

public interface AccountDao {
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
