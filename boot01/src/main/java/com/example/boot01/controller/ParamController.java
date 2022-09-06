package com.example.boot01.controller;

import com.example.boot01.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 16:39
 */
@Controller
public class ParamController {

    @RequestMapping("/p1")
    @ResponseBody
    public User p1(User user) {
        return user;
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        User user=new User(1,"凌念","123465",18);
        model.addAttribute("user",user);
        return "test.html";
    }
}
