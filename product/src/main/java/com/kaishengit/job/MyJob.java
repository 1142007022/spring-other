package com.kaishengit.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.kaishengit.entitys.Product;
import com.kaishengit.mapper.ProductMapper;

public class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		//重写方法将redis的数据备份到数据库
		JobDataMap jobDataMap = jobExecutionContext.getMergedJobDataMap();
		Integer id = jobDataMap.getIntegerFromString("productId");
		try {
			ApplicationContext applicationContext = (ApplicationContext) jobExecutionContext.getScheduler().getContext().get("applicationContext");
			
			
			StringRedisTemplate stringRedisTemplate = applicationContext.getBean(StringRedisTemplate.class);
			Long num = stringRedisTemplate.opsForList().size("product:" + id + "num");
			
			ProductMapper productMapper = applicationContext.getBean(ProductMapper.class);
			
			Product product = productMapper.selectByPrimaryKey(id);
			product.setNum(num.intValue());
			productMapper.updateByPrimaryKeySelective(product);
			
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
