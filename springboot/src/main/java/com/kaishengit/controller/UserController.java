package com.kaishengit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.User;
import com.kaishengit.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User info(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	@GetMapping
	public PageInfo all(@RequestParam(defaultValue="1")Integer p) {
		return userService.findAll(p);
	}
	
	
}
