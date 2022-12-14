package com.example.boot05.service.impl;

import com.example.boot05.entity.User;
import com.example.boot05.mapper.UserMapper;
import com.example.boot05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 9:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String findByUsername(String name ,String password, HttpServletResponse response) {
        String password1 = userMapper.findByUsername(name);
        if (password1 == null) {
            return "-1";//""用户不存在"
        }
        if (password.equals(password1)){
            User user = findUser(name);
            if (user != null) {
                Cookie cookie1 = new Cookie("username", user.getName());
                Cookie cookie2 = new Cookie("password", user.getPassword());
                cookie1.setMaxAge(60);
                cookie2.setMaxAge(60);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
            }
            return "1";//success
        }
        return "-2";//用户名或密码错误
    }

    @Override
    public User findUser(String name) {
        return userMapper.findUser(name);
    }
}
