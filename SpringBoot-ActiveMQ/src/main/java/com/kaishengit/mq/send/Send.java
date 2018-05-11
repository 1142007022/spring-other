package com.kaishengit.mq.send;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class Send {

	@Autowired
	private JmsTemplate jmsTemplate;

	// 发送队列消息
	public void sendQueue(String message) {

		ActiveMQQueue queue = new ActiveMQQueue("springboot-queue");
		jmsTemplate.send(queue, new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});

	}
	
	//发送订阅消息
	public void sendTopic(String message) {
		ActiveMQTopic topic = new ActiveMQTopic("springboot-topic");
		jmsTemplate.send(topic, new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

}
