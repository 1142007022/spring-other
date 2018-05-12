package com.kaishengit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kaishengit.service.TestService;

@RestController
public class TestController {

	@Reference(version="1.0")
	private TestService testService;
	
	@GetMapping("{id}")
	public String test(@PathVariable Integer id) {
		return testService.findById(id);
	}
	
}
