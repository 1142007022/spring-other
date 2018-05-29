package com.kaishengit.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kaishengit.service.TestService;

@Service(timeout = 5000,version = "1.0")
public class TestServiceImpl implements TestService{

	@Override
	public String test() {
		return "test";
	}

}
