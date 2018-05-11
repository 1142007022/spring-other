package com.kaishengit.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kaishengit.entitys.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Cacheable("user")
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

}
