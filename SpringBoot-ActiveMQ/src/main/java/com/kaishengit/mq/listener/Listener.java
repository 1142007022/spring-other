package com.kaishengit.mq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@JmsListener(destination = "springboot-queue")
	public void queueListern(Message message) throws JMSException {
		TextMessage textMessage = (TextMessage)message;
		System.out.println(textMessage.getText());
	}

	@JmsListener(destination="springboot-topic",containerFactory="topicListener")
	public void topicListener(Message message) throws JMSException {
		TextMessage textMessage = (TextMessage)message;
		System.out.println(textMessage.getText());
	}
	
}
