package com.kaishengit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.AccountExample;
import com.kaishengit.entitys.Roles;

@Mapper
public interface AccountMapper {
    long countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    List<Account> findAll();

    Account findById(Integer id);

    List<Account> findAccountWithParam(Map<String, Object> map);

    List<Roles> findRolesOfAccountByAcctId(Integer id);

    Account findByMobile(String mobile);
}