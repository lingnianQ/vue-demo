package com.example.boot03.service.impl;

import com.example.boot03.mapper.ProductMapper;
import com.example.boot03.model.Product;
import com.example.boot03.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:59
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public int insert(Product product) {
        return productMapper.insert(product);
    }
}
