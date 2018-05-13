package com.kaishengit.service;

import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.Roles;

import java.util.List;
import java.util.Map;

public interface AccountService {

    Account login(String mobile,String password,String loginIp);

    Account addAccount(Account account);

    List<Account> findAll();

    void delById(Integer id);

    Account findById(Integer id);

    void update(Account account);

    List<Account> findAccountWithParam(Map<String, Object> map);

    Account findByMobile(String mobile);

    List<Roles> findRolesOfAccountByAcctId(Integer id);
}
