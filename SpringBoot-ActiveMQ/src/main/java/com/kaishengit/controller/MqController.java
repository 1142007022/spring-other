package com.kaishengit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaishengit.mq.Send;

@RequestMapping("/mq")
@RestController
public class MqController {

	@Autowired
	private Send send;
	
	@GetMapping("/queue")
	public String queue() {
		send.sendQueue("queue test...");
		return "success";
	}
	
	@GetMapping("/topic")
	public String topic() {
		send.sendTopic("springboot-topic test...");
		return "success";
	}
	
}
