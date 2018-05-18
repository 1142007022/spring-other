package com.kaishengit.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaishengit.entitys.Account;
import com.kaishengit.service.AccountService;
import com.kaishengit.util.JwtUtil;

public class JwtRealm extends AuthorizingRealm {

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AccountService accountService;
	//此方法用于校验用户权限和角色
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}

	//验证用户登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		
		JwtToken jwtToken = (JwtToken) authenticationToken;
		
		String token = (String)jwtToken.getPrincipal();
		Integer userId = jwtUtil.getUserId(token);
		Account account = accountService.findById(userId); 
		
		if(account == null) {
			throw new UnknownAccountException("账户不存在");
		}else {
			try {
				jwtUtil.isTrue(token, account.getId(), account.getPassword());
			} catch (Exception e) {
				//只要是抛出异常  就表示token校验未通过
				e.printStackTrace();
                throw new AuthenticationException(e.getMessage(),e);
			}
			//走到此处说明是账户密码正确需要校验token是否正确
			
			
			
		}
		
		return new SimpleAuthenticationInfo(token,token,getName());
	}

}
