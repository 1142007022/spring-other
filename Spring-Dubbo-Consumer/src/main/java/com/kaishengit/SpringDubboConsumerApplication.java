package com.kaishengit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDubboConsumerApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringDubboConsumerApplication.class, args);
	}
}
