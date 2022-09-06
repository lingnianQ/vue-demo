package com.example.s1.controller;

import com.example.s1.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 15:52
 */
@Controller
public class ParamController {
    @RequestMapping("/p1")
    @ResponseBody
    public String p1(HttpServletRequest request) {
        String info = request.getParameter("info");
        return "接收到参数: " + info;
    }

    @RequestMapping("/p2")
    @ResponseBody
    public String p2(String name, String age) {
        return name + ":" + age;
    }

    @RequestMapping("/p3")
    @ResponseBody
    public Emp p3(Emp emp) {
        return emp;
    }
}
