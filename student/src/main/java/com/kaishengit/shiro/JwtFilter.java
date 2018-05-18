package com.kaishengit.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kaishengit.util.JwtUtil;

public class JwtFilter extends AccessControlFilter {

	private static final String  AUTHORIZATION_HEADER = "Authorization";
	
	@Autowired
	private JwtUtil jwtUtil;
	
	//判断哪些请求是需要进行登录之后才能进行访问的
	@Override
	protected boolean isAccessAllowed(ServletRequest arg0, ServletResponse arg1, Object arg2) throws Exception {
		HttpServletRequest request = (HttpServletRequest) arg0;
		//从请求头中获取token
		String  token = request.getHeader(AUTHORIZATION_HEADER);
		
		if(token == null) {
			loginError(arg1, "请先进行登录");
		}else {
			//此时有token  但是需要校验是否过期
			JwtToken jwtToken = new JwtToken(token);
			Subject subject = getSubject(arg0, arg1);
			
			try {
				subject.login(jwtToken);
                return true;
			} catch (Exception e) {
				 e.printStackTrace();
	                loginError(arg1,e.getMessage());
			}
		}
		
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest arg0, ServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin",
                httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods",
                "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                httpServletRequest.getHeader("Access-Control-Request-Headers"));
            // 跨域时会首先发送一个option请求，这里给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }
    
    //若校验失败则会执行该方法
    private void loginError(ServletResponse servletResponse, String message) throws IOException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.sendError(401,message);
    }

}
