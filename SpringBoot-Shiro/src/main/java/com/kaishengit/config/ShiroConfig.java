package com.kaishengit.config;

import java.util.LinkedHashMap;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.kaishengit.shiro.CustomerFilterChainDefinition;
import com.kaishengit.shiro.ShiroRealm;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

@Configuration
@ControllerAdvice
public class ShiroConfig {

    private Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

    /**
     * 处理Shiro异常
     */
    @ExceptionHandler(AuthorizationException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void authorizationExceptionHandler() {
        logger.error("没有权限访问该资源");
    }


    @Bean
    public Realm realm() {
        return new ShiroRealm();
    }

    @Bean
    public CustomerFilterChainDefinition customerFilterChainDefinition(ShiroFilterFactoryBean shiroFilterFactoryBean) throws Exception {
        CustomerFilterChainDefinition customerFilterChainDefinition = new CustomerFilterChainDefinition();
        customerFilterChainDefinition.setShiroFilter((AbstractShiroFilter) shiroFilterFactoryBean.getObject());

        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("/favicon.ico","anon");
        map.put("/logout","logout");

        customerFilterChainDefinition.setFilterChainDefinitions(map);
        return customerFilterChainDefinition;
    }


    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }
	
}
