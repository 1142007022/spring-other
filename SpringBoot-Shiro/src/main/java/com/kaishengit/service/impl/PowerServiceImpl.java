package com.kaishengit.service.impl;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.kaishengit.entitys.Power;
import com.kaishengit.entitys.PowerExample;
import com.kaishengit.entitys.RolesPowerExample;
import com.kaishengit.entitys.RolesPowerKey;
import com.kaishengit.exception.ServiceException;
import com.kaishengit.mapper.PowerMapper;
import com.kaishengit.mapper.RolesPowerMapper;
import com.kaishengit.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PowerServiceImpl implements PowerService {

    @Autowired
    private PowerMapper powerMapper;
    @Autowired
    private RolesPowerMapper rolesPowerMapper;

    @Override
    public void addPower(Power power) {
        powerMapper.insert(power);
    }

    @Override
    public List<Power> findAllPower() {
        List<Power> powerList = powerMapper.selectByExample(null);
        List<Power> resList = new ArrayList<>();
        toTreeList(powerList,resList,0);
        return resList;
    }

    @Override
    public Power findPowerById(Integer id) {
        return powerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Power power) {
        powerMapper.updateByPrimaryKeySelective(power);
    }

    @Override
    public List<Power> findMyPowerById(Integer id) {
        return powerMapper.findMyPowerById(id);
    }


    private void toTreeList(List<Power> sourceList, List<Power> endList, int parentId) {
        List<Power> tempList = Lists.newArrayList(Collections2.filter(sourceList, power -> power.getParentId().equals(parentId)));

        for(Power power : tempList) {
            endList.add(power);
            toTreeList(sourceList,endList,power.getId());
        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void delPowerById(Integer id){
        RolesPowerExample rolesPowerExample = new RolesPowerExample();
        rolesPowerExample.createCriteria().andPowerIdEqualTo(id);
        List<RolesPowerKey> rolesPowerKeyList = rolesPowerMapper.selectByExample(rolesPowerExample);
        if (rolesPowerKeyList != null && rolesPowerKeyList.size() != 0) {
            throw new ServiceException("有权限正在使用不可删除");
        } else {
            PowerExample powerExample = new PowerExample();
            powerExample.createCriteria().andParentIdEqualTo(id);
            List<Power> powerList = powerMapper.selectByExample(powerExample);
            if (powerList != null){
                for (Power power : powerList) {
                    delPowerById(power.getId());
                }
            }
            powerMapper.deleteByPrimaryKey(id);
        }
    }


}
