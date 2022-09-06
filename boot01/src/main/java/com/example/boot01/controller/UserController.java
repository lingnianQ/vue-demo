package com.example.boot01.controller;

import com.example.boot01.entity.User;
import com.example.boot01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 18:20
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(String name ,String password) {
        User user = userService.login(name);
        if (user == null) {
            return "用户不存在,请去注册";
        }
        if(user.getPassword().equals(password)){
            return "登录成功";
        }
        return "密码错误";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(String name, String password, Integer age) {

        String ageStr = String.valueOf(age);
        if (name.isEmpty() || password.isEmpty() || ageStr.isEmpty()) {
            return "注册失败";
        }
        User user = userService.findByUsername(name);
        if (user != null) {
            return "用户名已存在,请更换用户名";
        }
        userService.register(name, password, age);
        return "注册成功";
    }
}
