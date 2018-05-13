package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootShiroApplication.class, args);
	}
	
}
