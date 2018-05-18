package com.kaishengit.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaishengit.controller.result.Result;
import com.kaishengit.entitys.Account;

@RestController
@CrossOrigin("*")
public class LoginController {
	
	//登录
	@PostMapping("/login")
	public Result login(@RequestBody Account account) {
		return null;
	}

}
