package com.example.boot05.service;

import com.example.boot05.entity.User;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 9:48
 */

public interface UserService {
    String findByUsername(String name, String password);
}
