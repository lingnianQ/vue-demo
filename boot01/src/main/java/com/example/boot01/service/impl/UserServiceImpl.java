package com.example.boot01.service.impl;

import com.example.boot01.entity.User;
import com.example.boot01.mapper.UserMapper;
import com.example.boot01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 18:44
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String name) {
        return userMapper.findByUsername(name);
    }

    @Override
    public User findByUsername(String name) {
        return userMapper.findByUsername(name);
    }

    @Override
    public int register(String name, String password, Integer age) {
        return userMapper.save(name, password, age);
    }
}
