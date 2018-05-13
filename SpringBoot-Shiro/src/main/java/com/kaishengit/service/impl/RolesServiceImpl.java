package com.kaishengit.service.impl;

import com.kaishengit.entitys.*;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.mapper.AccountRolesMapper;
import com.kaishengit.mapper.RolesMapper;
import com.kaishengit.mapper.RolesPowerMapper;
import com.kaishengit.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

    @Autowired
    private RolesMapper rolesMapper;
    @Autowired
    private RolesPowerMapper rolesPowerMapper;
    @Autowired
    private AccountRolesMapper accountRolesMapper;
    @Override
    public void addRoles(Roles roles) {

    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void addRolesAndPowers(Roles roles, Integer[] powerIds) {
        rolesMapper.insert(roles);
        if(powerIds != null){
            for(Integer powerId:powerIds){
                RolesPowerKey rolesPowerKey = new RolesPowerKey();
                rolesPowerKey.setPowerId(powerId);
                rolesPowerKey.setRolesId(roles.getId());
                rolesPowerMapper.insert(rolesPowerKey);
            }
        }

    }

    @Override
    public List<Roles> findAllRoles() {
        return rolesMapper.findAllRoles();
    }

    @Override
    public void delById(Integer id) {
        AccountRolesExample accountRolesExample = new AccountRolesExample();
        accountRolesExample.createCriteria().andRolesIdEqualTo(id);
        List<AccountRolesKey> accountRolesKeysList = accountRolesMapper.selectByExample(accountRolesExample);
        if (accountRolesKeysList != null && accountRolesKeysList.size() != 0) {
            throw new ServiceException("有角色被占用不可删除");
        } else {
            RolesPowerExample rolesPowerExample = new RolesPowerExample();
            rolesPowerExample.createCriteria().andRolesIdEqualTo(id);
            rolesPowerMapper.deleteByExample(rolesPowerExample);
            rolesMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Roles findById(Integer id) {
        return rolesMapper.selectByPrimaryKey(id);
    }
}
