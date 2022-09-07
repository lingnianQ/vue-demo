package com.example.boot03.controller;

import com.example.boot03.mapper.ProductMapper;
import com.example.boot03.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:55
 */
@RestController
public class ProductController {
    @RequestMapping("/insert")
    public String insert() {
        ProductMapper productMapper = new ProductMapper() {
            @Override
            public int insert(Product product) {
                return 0;
            }
        };
        return "插入成功";
    }
}
