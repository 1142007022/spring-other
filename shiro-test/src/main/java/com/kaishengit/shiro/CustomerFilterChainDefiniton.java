package com.kaishengit.shiro;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;

//此类的类名是自己随便起的   但是最终要把这个类进行相关的配置  在springboot中使用配置类的形式进行
public class CustomerFilterChainDefiniton {
	
	//首先自动注入用于查找权限和角色的service
	
	
	private Map<String,String> filterChainDefinitions;
	private AbstractShiroFilter abstractShiroFilter;
	
	//生成上面两个属性的get  set方法
	
	
	
	//写一个初始化加载的方法 并且保证是线程安全的
	@PostConstruct
	public synchronized void init() {
		
		//先清空上一次的记录   再重新加载数据
		//1.调用clean()方法  自定义
		//2.调用自动以的load()方法
		
	}
	
	//自定义更新数据的方法
	public synchronized void update() {
		
		//先清空上一次的记录   再重新加载数据
		//1.调用clean()方法  自定义
		//2.调用自动以的load()方法
		
	}
	
	
	//自定义的动态加载路径和权限的对应关系
	public synchronized void load() {
        LinkedHashMap<String,String> urlMap = new LinkedHashMap<>();
        //加载静态资源
        urlMap.putAll(filterChainDefinitions);

        //从数据库中查找所有的权限对象(每一个权限对象后面都对应着相应的路径)
        List<Permission> permissionList = null;

        //迭代权限集合 
        for(Permission permission : permissionList) {
            //将每个权限对应的url加入到map中 "perms["+permission.getPermissionCode()+"]")
        }
        urlMap.put("/**","user");

        //URL和权限的关系设置到shiroFilter中
        DefaultFilterChainManager defaultFilterChainManager = null;
        for(Map.Entry<String,String> entry : urlMap.entrySet()) {
            defaultFilterChainManager.createChain(entry.getKey(),entry.getValue());
        }
	}
	

    private DefaultFilterChainManager getFilterChainManager() {
        PathMatchingFilterChainResolver pathMatchingFilterChainResolver = (PathMatchingFilterChainResolver) abstractShiroFilter.getFilterChainResolver();
        DefaultFilterChainManager defaultFilterChainManager = (DefaultFilterChainManager) pathMatchingFilterChainResolver.getFilterChainManager();
        return defaultFilterChainManager;
    }

}
