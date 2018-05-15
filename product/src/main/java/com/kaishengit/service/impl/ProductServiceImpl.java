package com.kaishengit.service.impl;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kaishengit.entitys.Product;
import com.kaishengit.job.MyJob;
import com.kaishengit.mapper.ProductMapper;
import com.kaishengit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private SchedulerFactoryBean scheduleBuilder;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private StringRedisTemplate redisTemplate;
	@Override
	public PageInfo<Product> findByPage(Integer p) {
		PageHelper.startPage(p, 10);
		List<Product> lists = productMapper.selectByExample(null);
		return new PageInfo<>(lists);
	}

	@Override
	public void add(Product product) {
		productMapper.insertSelective(product);
		//将数据添加到redis中 保存这个商品的详细信息
		redisTemplate.opsForValue().set("product:" + product.getId(), JSON.toJSONString(product));
		//这是一个list集合  用于存放这个商品的数量
		for(int i = 0;i < product.getNum();i++) {
			redisTemplate.opsForList().leftPush("product:" + product.getId() + "num", String.valueOf(i));
		}
		//添加定时任务  当秒杀活动结束之后  自动的更新数据库
		addSyncInventoryJob(product.getId(),product.getEndTime());
	}

	//动态的添加定时任务
	private void addSyncInventoryJob(Integer id, String endTime) {
		JobDataMap jobDataMap = new JobDataMap();
		jobDataMap.put("procuctId", id);
		JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("product" + id,"product:syc").setJobData(jobDataMap).build();
		DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
		DateTime dateTime = dateTimeFormat.parseDateTime(endTime);
		
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0 ");
        stringBuilder.append(dateTime.getMinuteOfHour()).append(" ");
        stringBuilder.append(dateTime.getHourOfDay()).append(" ");
        stringBuilder.append(dateTime.getDayOfMonth()).append(" ");
        stringBuilder.append(dateTime.getMonthOfYear()).append(" ");
        stringBuilder.append("? ");
        stringBuilder.append(dateTime.getYear());

        String cron = stringBuilder.toString();
        
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cron);
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(cronScheduleBuilder).build();
        
        Scheduler scheduled = scheduleBuilder.getScheduler();
        
        try {
			scheduled.scheduleJob(jobDetail,trigger);
			scheduled.start();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Product findById(Integer id) {
		return JSON.parseObject(redisTemplate.opsForValue().get("product:" + id), Product.class);
	}

	@Override
	public void buy(Integer id) throws RuntimeException {
		
		String json = redisTemplate.opsForValue().get("product:"+id);
        Product product = JSON.parseObject(json,Product.class);

        if(!product.isStart()) {
            throw new RuntimeException("你来早了，还没有开始");
        }
        if(product.isEnd()) {
            throw  new RuntimeException("抢购已结束");
        }
        
        if(redisTemplate.opsForList().leftPop("product:"+id+"num") != null) {
        	System.out.println("购买成功");
        }else {
        	System.out.println("已售罄");
        }
		
	}
	
}
