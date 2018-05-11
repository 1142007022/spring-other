package com.kaishengit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.kaishengit.entitys.User;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	private RedisTemplate redisTemplate;
	
	@Autowired
	public void setRedisTemplate(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
		this.redisTemplate.setKeySerializer(new StringRedisSerializer());
		this.redisTemplate.setValueSerializer(new StringRedisSerializer());
	}

	@Override
	public User findById(Integer id) {
		String key = "user:" + id;
		if(redisTemplate.hasKey(key)){
			String json = (String)redisTemplate.opsForValue().get(key);
			return new Gson().fromJson(json, User.class);
		}else {
			User user = userMapper.findById(id);
	        String json = new Gson().toJson(user);
	        redisTemplate.opsForValue().set(key,json);
	        return user;
		}
		
	}

}
