package com.example.boot01.mapper;

import com.example.boot01.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 10:34
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     */
    @Test
    void testFindAll() {
        userMapper.findAll().forEach(System.out::println);
    }

    @Test
    void findByUsername() {
        User user = userMapper.findByUsername("凌念");
        System.out.println(user);
    }

    @Test
    void save() {
        userMapper.save("零念", "123465", 20);
    }
}
