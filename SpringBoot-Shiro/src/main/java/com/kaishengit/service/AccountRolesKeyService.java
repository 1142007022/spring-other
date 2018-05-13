package com.kaishengit.service;

import com.kaishengit.entitys.Account;

public interface AccountRolesKeyService {
    void addAccountRoles(Account account, Integer[] rolesIds);

    void delByAccountId(Integer id);

    void update(Account account, Integer[] rolesIds);
}
