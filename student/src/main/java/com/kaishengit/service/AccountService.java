package com.kaishengit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaishengit.entitys.Account;
import com.kaishengit.mapper.AccountMapper;

@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;
	
	public Account findById(Integer userId) {
		return accountMapper.selectByPrimaryKey(userId);
	}

}
