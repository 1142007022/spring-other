package com.kaishengit.service.impl;


import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.AccountExample;
import com.kaishengit.entitys.AccountLoginLog;
import com.kaishengit.entitys.Roles;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.mapper.AccountMapper;
import com.kaishengit.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    private AccountExample accountExample = new AccountExample();
    @Override
    public Account login(String mobile, String password, String loginIp) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andMobileEqualTo(mobile);
        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if(accountList != null && accountList.size() != 0){
            Account account = accountList.get(0);
            if(account.getPassword().equals(DigestUtils.md5Hex(password))){
                if (account.getStatus().equals(Account.Status_Normal)){
                    AccountLoginLog accountLoginLog = new AccountLoginLog();
                    accountLoginLog.setAccountId(account.getId());
                    accountLoginLog.setLoginIp(loginIp);
                    return account;
                }else {
                    throw new ServiceException("帐号或面膜错误");
                }
            }else{
                throw new ServiceException("账号异常");
            }
        }else{
            throw new ServiceException("账号异常");
        }
    }

    @Override
    public Account addAccount(Account account) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andMobileEqualTo(account.getMobile());

        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if(accountList != null && accountList.size() != 0) {
            throw new ServiceException("帐号已存在");
        }

        String password = DigestUtils.md5Hex(account.getPassword());

        account.setPassword(password);

        accountMapper.insert(account);
        return account;
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public void delById(Integer id) {
        accountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Account findById(Integer id) {
        return accountMapper.findById(id);
    }

    @Override
    public void update(Account account) {
        accountMapper.updateByPrimaryKeySelective(account);
    }

    @Override
    public List<Account> findAccountWithParam(Map<String, Object> map) {
        return accountMapper.findAccountWithParam(map);
    }

    @Override
    public Account findByMobile(String mobile) {
        return accountMapper.findByMobile(mobile);
    }

    @Override
    public List<Roles> findRolesOfAccountByAcctId(Integer id) {
        return accountMapper.findRolesOfAccountByAcctId(id);
    }
}
