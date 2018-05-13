package com.kaishengit.shiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaishengit.entitys.Account;
import com.kaishengit.entitys.AccountLoginLog;
import com.kaishengit.entitys.Power;
import com.kaishengit.entitys.Roles;
import com.kaishengit.service.AccountService;
import com.kaishengit.service.PowerService;

public class ShiroRealm extends AuthorizingRealm{

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);


    @Autowired
    private AccountService accountService;
    @Autowired
    private PowerService powerService;


    /*
    * 判断角色和权限
    * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //获取当前登录的用户
        Account account = (Account) principalCollection.getPrimaryPrincipal();
        List<Power> powerList = new ArrayList<>();
        //获取当前登录的用户拥有哪些角色
        List<Roles> rolesList = accountService.findRolesOfAccountByAcctId(account.getId());
        for (Roles roles : rolesList) {
            System.out.println("拥有的角色：------"+roles.getRolesCode());
            System.out.println("角色id：------"+roles.getId());
            //获得这个角色拥有的所有权限
            List<Power> rolesPowerList = powerService.findMyPowerById(roles.getId());
            powerList.addAll(rolesPowerList);
        }

        Set<String> rolesSet = new HashSet<>();
        for (Roles roles:rolesList){
            rolesSet.add(roles.getRolesCode());
        }

        Set<String> powerSet = new HashSet<>();
        for (Power power:powerList){
            System.out.println("拥有的权限：------"+power.getPowerCode());
            powerSet.add(power.getPowerCode());
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(rolesSet);
        simpleAuthorizationInfo.setStringPermissions(powerSet);

        return simpleAuthorizationInfo;
    }

    //判断登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

        String mobile = usernamePasswordToken.getUsername();
        System.out.println("mobile-----"+mobile);
        if (mobile != null) {
            Account account = accountService.findByMobile(mobile);
            System.out.println("name---"+account.getAccName());
            if (account == null) {
                throw new UnknownAccountException("账户或者密码错误" + mobile);
            }else{
                if (account.getStatus().equals(Account.Status_Normal)){
                    logger.info("{}登录",account);
                    return new SimpleAuthenticationInfo(account,account.getPassword(),getName());
                }else{
                    throw new LockedAccountException("账户异常");
                }
            }
        }
        return null;
    }
}