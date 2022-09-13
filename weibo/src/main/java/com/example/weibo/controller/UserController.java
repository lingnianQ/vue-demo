package com.example.weibo.controller;

import com.example.weibo.entity.User;
import com.example.weibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/13 17:33
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/reg")
    public int reg(@RequestBody User user) {
        if (user == null) {
            return -2;
        }

        if (userMapper.selectByName(user.getName()) != null) {
            return 0;
        }
        userMapper.insert(user);
        return 1;
    }

    @RequestMapping("/login")
    public int login(String name, String password) {
        User user = userMapper.selectByName(name);
        if (user == null) {
            return -1;
        }

        if (user.getPassword().equals(password)) {
            return 1;
        }
        return 0;
    }
}
