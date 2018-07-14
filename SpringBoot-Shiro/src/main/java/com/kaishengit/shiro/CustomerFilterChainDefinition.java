package com.kaishengit.shiro;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaishengit.entitys.Power;
import com.kaishengit.service.PowerService;


public class CustomerFilterChainDefinition {

    private Logger logger = LoggerFactory.getLogger(CustomerFilterChainDefinition.class);

    @Autowired
    private PowerService powerService;

    private Map<String,String> filterChainDefinitions;
    private AbstractShiroFilter shiroFilter;


    public void setFilterChainDefinitions(Map<String, String> filterChainDefinitions) {
        this.filterChainDefinitions = filterChainDefinitions;
    }

    public void setShiroFilter(AbstractShiroFilter shiroFilter) {
        this.shiroFilter = shiroFilter;
    }

    
    /**
     * 初始化方法  注解的作用是保证在类加载的时候就执行这个方法  保证线程安全
     */
    @PostConstruct
    public synchronized void init() {
        logger.info("------初始化URL权限-----------");
        //清除原有的URL权限
        getFilterChainManager().getFilterChains().clear();
        //加载现有的URL权限
        load();
        logger.info("------初始化URL权限结束-----------");
    }

    /**
     * 每次加载的售后都进行更新处理
     */
    public synchronized void updateUrlPermission() {
        logger.info("------刷新URL权限-----------");
        getFilterChainManager().getFilterChains().clear();
        load();
        logger.info("------刷新URL权限结束-----------");
    }

    /**
     * 加载方法 
     */
    public synchronized void load() {
        LinkedHashMap<String,String> urlMap = new LinkedHashMap<>();
        urlMap.putAll(filterChainDefinitions);
        List<Power> powerList = powerService.findAllPower();

        //像map集合中添加键值对的格式是固定的
        for(Power power : powerList) {
            urlMap.put(power.getUrl(),"perms["+power.getPowerCode()+"]");
        }
        //最后添加"/**" "user"
        urlMap.put("/**","user");

        //URL和权限的关系设置到shiroFilter中
        DefaultFilterChainManager defaultFilterChainManager = getFilterChainManager();
        for(Map.Entry<String,String> entry : urlMap.entrySet()) {
            defaultFilterChainManager.createChain(entry.getKey(),entry.getValue());
        }
    }


    private DefaultFilterChainManager getFilterChainManager() {
        PathMatchingFilterChainResolver pathMatchingFilterChainResolver = (PathMatchingFilterChainResolver) shiroFilter.getFilterChainResolver();
        DefaultFilterChainManager defaultFilterChainManager = (DefaultFilterChainManager) pathMatchingFilterChainResolver.getFilterChainManager();
        return defaultFilterChainManager;
    }
}
