package com.kaishengit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.kaishengit.entitys.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper uesrMapper;
	
	private RedisTemplate redisTemplate;
	
	//此处的自动注入注入的是这个方法中的参数
	@Autowired
	public void setRedisTemplate(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
        this.redisTemplate.setKeySerializer(new StringRedisSerializer());
        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));
	}


	@Override
	public User findById(Integer id) {
		String key = "user" + id;
		if(redisTemplate.hasKey(key)) {
			 String json = (String) redisTemplate.opsForValue().get(key);
	         return new Gson().fromJson(json,User.class);
		}else {
			User user = uesrMapper.findById(id);
			String json = new Gson().toJson(user);
			redisTemplate.opsForValue().set(key, user);
			return user;
		}
	}


	@Override
	public PageInfo<User> findAll(Integer p) {
		PageHelper.startPage(p, 1);
		List<User> lists = uesrMapper.findAll();
		return new PageInfo<>(lists);
	}

}
