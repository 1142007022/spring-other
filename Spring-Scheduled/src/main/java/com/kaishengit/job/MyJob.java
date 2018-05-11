package com.kaishengit.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob {
	
	@Scheduled(cron="0/2 * * * * *")
	public void doJob() {
		System.out.println("执行...");
	}

}
