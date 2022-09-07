package com.example.boot01.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 15:11
 */
@SpringBootTest
class IProductServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    void testUserFindAll() {
        userService.findAll().forEach(System.out::println);
    }
}