package com.example.boot06.service;

import com.example.boot06.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 10:52
 */

public interface IProductService {

    Product selectById(int id);

    int update(Product product);

    int deleteById(int id);

    List<Product> loadAll(int pageNum);

    int insert(Product product);

}
