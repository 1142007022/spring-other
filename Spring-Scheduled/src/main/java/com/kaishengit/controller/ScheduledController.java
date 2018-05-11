package com.kaishengit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaishengit.job.MyJob;

@RestController
@RequestMapping
public class ScheduledController {

	@Autowired
	private MyJob myJob;
	
	@GetMapping
	public String info() {
		myJob.doJob();
		return "success ...";
	}
	
}
