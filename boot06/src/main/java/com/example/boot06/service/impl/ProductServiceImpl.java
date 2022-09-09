package com.example.boot06.service.impl;

import com.example.boot06.entity.Product;
import com.example.boot06.mapper.ProductMapper;
import com.example.boot06.service.IProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 10:53
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public int insert(Product product) {
        return productMapper.save(product);
    }

    @Override
    public Product selectById(int id) {
        return productMapper.selectById(id);
    }

    @Override
    public int update(Product product) {
       productMapper.update(product);
       return 1;
    }

    @Override
    public int deleteById(int id) {
        return productMapper.deleteById(id);
    }

    @Override
    public List<Product> loadAll(int pageNum) {
        PageHelper.startPage(pageNum,10);
        List<Product> list = productMapper.findAll();
        PageInfo<Product> page = new PageInfo<Product>(list);
//        System.out.println(page.getList());
//        page.getList().forEach(System.out::println);
//        System.out.println(page);
        return page.getList();
    }
}
