package com.kaishengit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
public class QuqrtyConfig {

	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(DataSource dataSource,DataSourceTransactionManager dataSourceTransactionManager) {
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
		schedulerFactoryBean.setDataSource(dataSource);
		schedulerFactoryBean.setTransactionManager(dataSourceTransactionManager);
		schedulerFactoryBean.setConfigLocation(new ClassPathResource("quartz.properties"));
		schedulerFactoryBean.setOverwriteExistingJobs(true);
		schedulerFactoryBean.setApplicationContextSchedulerContextKey("applicationContext");
		return schedulerFactoryBean;
	}
	
}
