package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActiveMqApplication.class, args);
	}
}
