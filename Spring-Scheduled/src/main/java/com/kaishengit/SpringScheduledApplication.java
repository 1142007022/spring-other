package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScheduledApplication.class, args);
	}
}
