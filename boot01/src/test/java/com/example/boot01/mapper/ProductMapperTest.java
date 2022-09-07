package com.example.boot01.mapper;

import com.example.boot01.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 15:13
 */
@SpringBootTest
class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    void deleteById() {
        productMapper.deleteById(5);
    }

    @Test
    void findAll() {
        productMapper.findAll().forEach(System.out::println);
    }

    @Test
    void save() {
        Product product = new Product(null, "三体1", 125.0, 100);
        productMapper.save(product);
    }
}