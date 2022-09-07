package com.example.boot01.service;

import com.example.boot01.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 15:37
 */
@SpringBootTest
class IUserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    void findAll() {
        userService.findAll().forEach(System.out::println);
    }

    @Test
    void login() {
        User user = userService.login("零念");
        System.out.println(user);
    }

    @Test
    void findByUsername() {
        User user = userService.findByUsername("零念");
        System.out.println(user);
    }

    @Test
    void register() {
        userService.register("曦光", "123456", 21);
    }
}