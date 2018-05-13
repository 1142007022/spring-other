package com.kaishengit.controller.exception;

import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(UnauthenticatedException.class)
    public String unauthorizedHandler(){
        return "error/401";
    }

}
