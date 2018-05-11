package com.kaishengit.config;

import javax.jms.ConnectionFactory;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration
@EnableJms
public class MQConfig {

	@Bean
	public JmsListenerContainerFactory topicListener(ConnectionFactory connectionFaction,DefaultJmsListenerContainerFactoryConfigurer config) {
		
		DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
		config.configure(jmsListenerContainerFactory, connectionFaction);
		jmsListenerContainerFactory.setPubSubDomain(true);
		return jmsListenerContainerFactory;
	}
	
	
}
