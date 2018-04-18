package com.dream.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jacob
 * @date 2018/4/18.
 */
@ControllerAdvice
public class ExcepHandler {

    @ExceptionHandler
    public String exceptionHander(HttpServletRequest req,Exception ex){
        String msg="程序出错";
        if(ex instanceof UsernameException){
            msg=ex.getMessage();
        }
        if(ex instanceof PasswordException){
            msg=ex.getMessage();
        }

        return msg;
    }
}
