package com.kaishengit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.kaishengit.entitys.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountGetTest {
	
	@Autowired
	private RedisTemplate redisTemplate;
	

	@Test
	public void getTest() {
		
		if(redisTemplate.hasKey("account1")) {
			String json = (String)redisTemplate.opsForValue().get("account1");
			Account account = new Gson().fromJson(json, Account.class);
		}else {
			System.out.println("222");
		}
		
		
	}
	
}
