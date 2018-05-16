package com.kaishengit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin("*")
public class HomeController {

	@GetMapping("/user/{id}")
	public Map<String,String> home(@PathVariable Integer id){
		Map<String,String> map = new HashMap<>();
		map.put("name", "jiangdong");
		map.put("sex","man");
		map.put("address", "jiaozuo");
		return map;
	}
	
}
