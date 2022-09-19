package com.example.boot05.service;

import com.example.boot05.entity.User;

import javax.servlet.http.HttpServletResponse;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 9:48
 */

public interface UserService {
    String findByUsername(String name, String password, HttpServletResponse response);
    User findUser(String name);

}
