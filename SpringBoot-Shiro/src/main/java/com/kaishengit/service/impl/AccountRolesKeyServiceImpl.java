package com.kaishengit.service.impl;

import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.AccountRolesExample;
import com.kaishengit.entitys.AccountRolesKey;
import com.kaishengit.mapper.AccountRolesMapper;
import com.kaishengit.service.AccountRolesKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountRolesKeyServiceImpl implements AccountRolesKeyService {

    @Autowired
    private AccountRolesMapper accountRolesMapper;
    private AccountRolesExample accountRolesExample = new AccountRolesExample();

    @Override
    public void addAccountRoles(Account account, Integer[] rolesIds) {
        accountRolesExample.createCriteria().andAccountIdEqualTo(account.getId());
        accountRolesMapper.deleteByExample(accountRolesExample);
        for (int rolesId:rolesIds){
            AccountRolesKey accountRolesKey = new AccountRolesKey();
            accountRolesKey.setAccountId(account.getId());
            accountRolesKey.setRolesId(rolesId);
            accountRolesMapper.insertSelective(accountRolesKey);
        }
    }

    @Override
    public void delByAccountId(Integer id) {
        accountRolesExample.createCriteria().andAccountIdEqualTo(id);
        accountRolesMapper.deleteByExample(accountRolesExample);
    }

    @Override
    public void update(Account account, Integer[] rolesIds) {
        accountRolesExample.createCriteria().andAccountIdEqualTo(account.getId());
        accountRolesMapper.deleteByExample(accountRolesExample);

        for (int rolesId:rolesIds){
            AccountRolesKey accountRolesKey = new AccountRolesKey();
            accountRolesKey.setRolesId(rolesId);
            accountRolesKey.setAccountId(account.getId());
            accountRolesMapper.insertSelective(accountRolesKey);
        }
    }
}
