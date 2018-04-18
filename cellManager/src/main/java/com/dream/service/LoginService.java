package com.dream.service;

import com.dream.bean.User;
import com.dream.dao.UserMapper;
import com.dream.exception.PasswordException;
import com.dream.exception.UsernameException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jacob
 * @date 2018/4/18.
 */
@Service
public class LoginService {

    @Resource
    private UserMapper userMapper;


    public User login(String username, String password){

        User user = userMapper.selectByUsername(username);
        if(user==null){
            throw new UsernameException("用户名错误！");
        }

        if(!user.getPassword().equals(password)){
            throw new PasswordException("密码错误!");
        }

        return user;
    }
}
