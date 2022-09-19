package com.example.boot05.controller;

import com.example.boot05.entity.User;
import com.example.boot05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/8 17:14
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String name, String password,HttpServletResponse response) {


        return userService.findByUsername(name, password,response);
    }


    @RequestMapping("/check")
    public String checkUsername(String name) {
        if (name.equals("")) {
            return "用户名为空";
        }
        if (name.equals("qwe")) {
            System.out.println(name);
            return "用户已存在";
        }
        System.out.println(name);
        return "用户名可用";
    }

    @RequestMapping("/reg")
    public String reg(@RequestBody User user) {

        System.out.println(user);
        return "注册成功";
    }
}
