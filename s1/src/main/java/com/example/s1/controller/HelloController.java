package com.example.s1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 15:08
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public void hello(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println("Hello!!!");
        pw.close();
    }


    @RequestMapping("/hello1")
    @ResponseBody
    public String hello1() {
        return "请求成功!!";
    }


}
