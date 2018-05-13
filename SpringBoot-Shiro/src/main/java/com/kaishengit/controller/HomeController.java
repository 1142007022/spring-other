package com.kaishengit.controller;

import com.kaishengit.service.AccountService;
import com.kaishengit.shiro.CustomerFilterChainDefinition;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HomeController {
    @Autowired
    private CustomerFilterChainDefinition customerFilterChainDefinition;

    @Autowired
    public AccountService accountService;

    @GetMapping("/401")
    public String errorPage() {
        return "error/401";
    }

    @GetMapping("/")
    public String home(HttpServletRequest req, HttpServletResponse resp) {

        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            //如果成立的话代表用户是登陆过的 是想退出登录
            System.out.println("安全退出");
            subject.logout();
        }

        if (subject.isRemembered()) {
            //如果成立的话代表用户是点击了记住我  那么此处就应该直接跳转到主页
            System.out.println("直接进入主页");
            return "redirect:/home";
        }
        //以上两者都不成立的话  正常登录
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/")
    public String login(String mobile, String password, HttpServletRequest request, RedirectAttributes redirectAttributes, String remember) {
        Subject subject = SecurityUtils.getSubject();
        String ip = request.getRemoteAddr();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(mobile, DigestUtils.md5Hex(password), remember != null, ip);
        try {
            subject.login(usernamePasswordToken);
            SavedRequest savedRequest = WebUtils.getSavedRequest(request);

            String url = "/home";
            if (savedRequest != null) {
                url = savedRequest.getRequestUrl();
            }
            return "redirect:" + url;
        } catch (UnknownAccountException | IncorrectCredentialsException ex) {

            redirectAttributes.addFlashAttribute("message", "账户或密码错误");
        } catch (LockedAccountException ex) {
            redirectAttributes.addFlashAttribute("message", "账户状态异常");
        } catch (AuthenticationException ex) {
            redirectAttributes.addFlashAttribute("message", "账户或密码错误");
        }
        return "redirect:/";
    }


}
