package com.dream.controller;

import com.dream.bean.User;
import com.dream.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Jacob
 * @date 2018/4/18.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping("/login.form")
    public String login(String username,String password){
        if(username=="" || username.isEmpty()){

        }
        if(password=="" || password.isEmpty()){

        }

        User user = loginService.login(username,password);
        System.out.println(user);

        return "success";
    }

}
