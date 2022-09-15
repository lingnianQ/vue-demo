package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:36
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/login")
    public Result login(String name, String password) {
        return userService.selectByUsername(name, password);
    }



}
