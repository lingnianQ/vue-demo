package com.example.weibo.controller;

import com.example.weibo.entity.User;
import com.example.weibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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
            return -2;//未接收到数据
        }

        if (userMapper.selectByName(user.getName()) != null) {
            return 0;//用户存在
        }
        userMapper.insert(user);
        return 1;//注册成功
    }

    @RequestMapping("/login")
    public int login(@RequestBody User user, HttpSession session) {
        User user1 = userMapper.selectByName(user.getName());
        if (user1 == null) {
            return -1;//用户名不存在
        }

        if (user1.getPassword().equals(user.getPassword())) {
            session.setAttribute("user", user1);
            return 1;//登录成功
        }
        return 0;//密码错误
    }

    @RequestMapping("/currentUser")
    public User currentUser(HttpSession session) {
        //获取session
        return (User) session.getAttribute("user");
    }

    @RequestMapping("/logout")
    public void logout(HttpSession session) {
        session.removeAttribute("user");
    }
}
