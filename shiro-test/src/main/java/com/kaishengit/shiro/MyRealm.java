package com.kaishengit.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.PrincipalCollection;


//自定义的Realm类需要继承shiro提供的AuthorizingRealm
public class MyRealm extends AuthorizingRealm {

	//负责验证当前的登录对象是否有相应的权限
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取当前的登录对象
		Object object = principals.getPrimaryPrincipal();
		//获取当前对象的权限和角色  这一步要根据你自己注入的service来完成  将得到的结果添加到两个set里面  使用set是因为set是不允许重复存在的
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		simpleAuthorizationInfo.setRoles(null);//将你查询到的roles集合添加到这里即可
		simpleAuthorizationInfo.setStringPermissions(null);//添加权限
		return simpleAuthorizationInfo;
	}

	
	//负责验证登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		return null;
	}

}
