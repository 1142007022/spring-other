package com.kaishengit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kaishengit.entitys.Roles;
import com.kaishengit.entitys.RolesExample;

@Mapper
public interface RolesMapper {
    long countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);

    List<Roles> findAllRoles();
}