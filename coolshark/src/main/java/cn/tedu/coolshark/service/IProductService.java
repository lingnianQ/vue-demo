package cn.tedu.coolshark.service;

import cn.tedu.coolshark.model.Product;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 17:22
 */

public interface IProductService {
    void insert(Product product);

    List<Product> findAll();

    void deleteById(int id);

    String selectUrlById(int id);
}
