package com.dream.dao;


import com.dream.bean.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    User selectByUsername(String username);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}