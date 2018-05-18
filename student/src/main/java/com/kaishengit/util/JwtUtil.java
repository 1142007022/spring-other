package com.kaishengit.util;

import java.io.UnsupportedEncodingException;
import java.sql.Date;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

//定义JWT的配置类 并放入spring容器
@Component
public class JwtUtil {

	//定义过期时间
	private static final long OVER_DATE = 1000 * 60 * 60 * 24 * 7L;
	
	//创建token
	public String createToken(Integer userId,String password) {
		
		try {
			//定义所采用的加密算法
			Algorithm algorithm = Algorithm.HMAC384(password);
			return JWT.create().withClaim("userId", userId).withExpiresAt(new Date(System.currentTimeMillis() + OVER_DATE)).sign(algorithm);
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			e.printStackTrace();
            throw new RuntimeException("创建JWT Token异常",e);
		}
		
	}
	
	
	//定义一个从token中获取指定键的值的方法
	
	public Integer getUserId(String token) {
		
		DecodedJWT decodedJWT = JWT.decode(token);
		return decodedJWT.getClaim("userId").asInt();
		
	}
	
	
	
	
	//定义验证token是否正确
	
	public void isTrue(String token,Integer userId,String password) {
		
		try {
			//password是这个token的密钥
			Algorithm algorithm = Algorithm.HMAC384(password);
			JWTVerifier jwtVerifier = JWT.require(algorithm).withClaim("userId", userId).build();
			//校验token是没有返回值的  只要程序没有抛出异常就是通过校验
			jwtVerifier.verify(token);
			
		} catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw  new RuntimeException("JWT Token不合法",e);
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            throw new RuntimeException("JWT Token已过期",e);
        } catch (JWTVerificationException e) {
            e.printStackTrace();
            throw  new RuntimeException("JWT Token不合法",e);
        }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
