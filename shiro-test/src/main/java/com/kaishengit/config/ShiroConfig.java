package com.kaishengit.config;

import java.util.LinkedHashMap;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kaishengit.shiro.CustomerFilterChainDefiniton;
import com.kaishengit.shiro.MyRealm;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

//专门同来设置shiro的类
@Configuration
public class ShiroConfig {

	//将原来在xml文件中的配置写在配置类里面
	//定义处理异常的方法
	@ExceptionHandler(AuthorizationException.class)
	@ResponseStatus(HttpStatus.FORBIDDEN)
    public void authorizationExceptionHandler() {
    }
	
	@Bean
	public Realm realm() {
		return new MyRealm();
	}
	
	@Bean
	public CustomerFilterChainDefiniton customerFilterChainDefiniton(ShiroFilterFactoryBean shiroFilterFactoryBean) throws Exception {
		CustomerFilterChainDefiniton customerFilterChainDefiniton = new CustomerFilterChainDefiniton();
		customerFilterChainDefiniton.setAbstractShiroFilter((AbstractShiroFilter)shiroFilterFactoryBean.getObject());
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("/favicon.ico","anon");
        map.put("/logout","logout");
        customerFilterChainDefiniton.setFilterChainDefinitions(map);
        return customerFilterChainDefiniton;
	}
	
	//shiro+thymeleaf
	@Bean
	public ShiroDialect shiroDialect() {
		return new ShiroDialect();
	}
	
}
