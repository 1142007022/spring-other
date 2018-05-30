package com.kaishengit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.kaishengit.entitys.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;
	
	
	@Test
	public void contextLoads() {
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		Account account = new Account();
		account.setId(3);
		account.setName("test");
		String json = new Gson().toJson(account);
		redisTemplate.opsForValue().set("account1", json);
		
		
		if(redisTemplate.hasKey("account1")) {
			String json1 = (String)redisTemplate.opsForValue().get("account1");
			Account acc = new Gson().fromJson(json1, Account.class);
			System.out.println(acc);
		}else {
			System.out.println("222");
		}
		
	}


}
