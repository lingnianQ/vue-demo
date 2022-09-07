package com.example.boot01.service;

import com.example.boot01.entity.Product;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 11:01
 */

public interface IProductService {

    /**
     * 删除商品
     * @return
     */
    boolean deleteById(int id);

    /**
     * 查询商品列表
     * @return
     */
    List<Product> findAll();
    /**
     * 添加商品
     * @param product
     * @return
     */
    int add(Product product);
}
