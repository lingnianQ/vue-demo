package com.example.boot03.controller;

import com.example.boot03.mapper.ProductMapper;
import com.example.boot03.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:55
 */
@RestController
public class ProductController {
//    @Autowired(required = false)-----解决误提示
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/insert")
    public String insert(Product product) {

        productMapper.insert(product);
        return "插入成功";
    }
}
