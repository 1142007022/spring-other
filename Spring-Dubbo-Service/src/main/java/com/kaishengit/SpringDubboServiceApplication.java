package com.kaishengit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDubboServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringDubboServiceApplication.class, args);
		System.out.println("Service staring....");
        System.in.read();
	}
}
