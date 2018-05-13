package com.kaishengit.service;

import com.kaishengit.entitys.Power;
import com.kaishengit.entitys.Roles;

import java.util.List;

public interface RolesService {

    void addRoles(Roles roles);

    void addRolesAndPowers(Roles roles,Integer[] powerIds);

    List<Roles> findAllRoles();

    void delById(Integer id);

    Roles findById(Integer id);
}
