package com.example.boot06.controller;

import com.example.boot06.entity.Product;
import com.example.boot06.service.IProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 10:51
 */
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/update")
    public int update(@RequestBody Product product){

        return productService.update(product);
    }

    @RequestMapping("/selectById")
    public Product selectById(int id){
        System.out.println("id = " + id);

        return productService.selectById(id);
    }


    /**
     * 插入商品
     * @param product
     * @return 1
     */
    @RequestMapping("/insert")
    public int insert(@RequestBody Product product){
        return productService.insert(product);
    }

    @RequestMapping("/del")
    public int del(int id){
        return productService.deleteById(id);
    }


    @RequestMapping("/select")
    public List<Product> select(int pageNum){
        return productService.loadAll(pageNum);
    }

}
