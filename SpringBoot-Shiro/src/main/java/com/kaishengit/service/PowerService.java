package com.kaishengit.service;

import com.kaishengit.entitys.Power;

import java.util.List;

public interface PowerService {

    void addPower(Power power);


    void delPowerById(Integer id);

    List<Power> findAllPower();

    Power findPowerById(Integer id);

    void update(Power power);

    List<Power> findMyPowerById(Integer id);
}
