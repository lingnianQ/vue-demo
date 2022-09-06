package com.example.boot01.service;

import com.example.boot01.entity.User;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 18:44
 */

public interface IUserService {
    /**
     * 登录
     * @param name
     * @return
     */
    User login(String name);
    /**
     * 根据用户名查找
     * @param name
     * @return
     */
    User findByUsername(String name);
    /**
     * register
     * @param name
     * @param password
     * @param age
     * @return
     */
    int register(String name, String password, Integer age);

}
