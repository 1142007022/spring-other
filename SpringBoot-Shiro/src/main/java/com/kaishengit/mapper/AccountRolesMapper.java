package com.kaishengit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kaishengit.entitys.AccountRolesExample;
import com.kaishengit.entitys.AccountRolesKey;

@Mapper
public interface AccountRolesMapper {
    long countByExample(AccountRolesExample example);

    int deleteByExample(AccountRolesExample example);

    int deleteByPrimaryKey(AccountRolesKey key);

    int insert(AccountRolesKey record);

    int insertSelective(AccountRolesKey record);

    List<AccountRolesKey> selectByExample(AccountRolesExample example);

    int updateByExampleSelective(@Param("record") AccountRolesKey record, @Param("example") AccountRolesExample example);

    int updateByExample(@Param("record") AccountRolesKey record, @Param("example") AccountRolesExample example);
}