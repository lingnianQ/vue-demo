package com.example.boot03.service;

import com.example.boot03.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:56
 */

public interface ProductService {

    int insert(Product product);
}
