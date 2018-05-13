package com.kaishengit.service.impl;

import com.kaishengit.entitys.Roles;
import com.kaishengit.entitys.RolesPowerExample;
import com.kaishengit.entitys.RolesPowerKey;
import com.kaishengit.mapper.RolesMapper;
import com.kaishengit.mapper.RolesPowerMapper;
import com.kaishengit.service.RolesPowerKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesPowerKeyServiceImpl implements RolesPowerKeyService {
    @Autowired
    private RolesPowerMapper rolesPowerMapper;
    @Autowired
     private RolesMapper rolesMapper;
    RolesPowerExample rolesPowerExample = new RolesPowerExample();
    @Override
    public void update(Integer[] powerIds, Roles roles) {
        rolesPowerExample.createCriteria().andRolesIdEqualTo(roles.getId());
        rolesPowerMapper.deleteByExample(rolesPowerExample);
        if (powerIds != null){
            for (int powerId : powerIds){
                RolesPowerKey rolesPowerKey = new RolesPowerKey();
                rolesPowerKey.setRolesId(roles.getId());
                rolesPowerKey.setPowerId(powerId);
                rolesPowerMapper.insertSelective(rolesPowerKey);
            }
        }
        rolesMapper.updateByPrimaryKeySelective(roles);
    }
}
