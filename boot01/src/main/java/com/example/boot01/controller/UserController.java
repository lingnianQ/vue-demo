package com.example.boot01.controller;

import com.example.boot01.entity.User;
import com.example.boot01.service.IUserService;
import com.example.boot01.utils.DBUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 18:20
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login1")
    @ResponseBody
    public String login1(User user) {
        try (Connection conn = DBUtils.getConnection()) {
            String sql = "select password from t_user where name=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (user.getPassword().equals(rs.getString(1))){
                    return "登录成功";
                }
                return "密码错误";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "用户不存在";
    }

    @RequestMapping("/reg1")
    @ResponseBody
    public String reg1(User user) {
        System.out.println(user);
        try (Connection conn = DBUtils.getConnection()) {
            String sql = "select * from t_user where name=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getInt(1)
                        , rs.getString(2)
                        , rs.getString(3)
                        , rs.getInt(4));
                System.out.println(user);
                return "用户已存在!";
            }

            String sql2 = "insert into t_user values (null,?,?,?)";
            ps = conn.prepareStatement(sql2);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAge());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "注册成功: " + user.toString();
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String name, String password) {
        User user = userService.login(name);
        if (user == null) {
            return "用户不存在,请去注册";
        }
        if (user.getPassword().equals(password)) {
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
