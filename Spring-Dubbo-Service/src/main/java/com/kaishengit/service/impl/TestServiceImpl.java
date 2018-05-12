package com.kaishengit.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kaishengit.service.TestService;

@Service(version = "1.0", timeout = 5000)
public class TestServiceImpl implements TestService {

	@Override
	public String findById(Integer id) {
		if(id == 1) {
			return "kobe...";
		}else {
			return "jordan...";
		}
	}

}
