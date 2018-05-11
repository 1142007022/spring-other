package com.kaishengit.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.kaishengit.filter.MyFilter;
import com.kaishengit.interceptor.MyInterceptor;
import com.kaishengit.listener.MyListener;

import ch.qos.logback.core.net.SyslogOutputStream;

@Configuration
public class MyConfig extends WebMvcConfigurerAdapter{

	//添加过滤器
	@Bean
	public FilterRegistrationBean filter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new MyFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
		
	}
	
	//添加拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
	
	//添加监听器
	@Bean
	public ServletListenerRegistrationBean servletListenerRegistrationBean() {
		ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
		servletListenerRegistrationBean.setListener(new MyListener());
		return servletListenerRegistrationBean;
	}
	
}
