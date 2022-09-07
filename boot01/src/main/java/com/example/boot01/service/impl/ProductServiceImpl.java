package com.example.boot01.service.impl;

import com.example.boot01.entity.Product;
import com.example.boot01.mapper.ProductMapper;
import com.example.boot01.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 11:02
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public boolean deleteById(int id) {
        return productMapper.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int add(Product product) {
        return productMapper.save(product);
    }
}
