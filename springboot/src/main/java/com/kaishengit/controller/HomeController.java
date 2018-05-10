package com.kaishengit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kaishengit.dao.TestDao;

@Controller
public class HomeController {
	
	@Autowired
	private TestDao testDao;
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("message", "jiang");
		model.addAttribute("age", 30);
		List<String> lists = new ArrayList<>();
		lists.add("1");
		lists.add("2");
		lists.add("3");
		model.addAttribute("lists", lists);
		testDao.insert("123", "456", "正常", "姜东");
		return "home/home";
	}
	
}
