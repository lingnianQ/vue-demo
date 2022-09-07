package com.example.boot01.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:10
 */
@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    void login() {
        userController.login("零念", "123456");
    }
}