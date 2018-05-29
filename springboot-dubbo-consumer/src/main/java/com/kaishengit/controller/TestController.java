package com.kaishengit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kaishengit.service.TestService;

@RestController
public class TestController {

	@Reference(version="1.0")
	private TestService testService;
	
	@GetMapping("/")
	public String test() {
		return testService.test();
	}
	
}
