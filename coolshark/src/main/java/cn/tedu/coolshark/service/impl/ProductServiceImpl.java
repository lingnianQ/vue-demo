package cn.tedu.coolshark.service.impl;

import cn.tedu.coolshark.mapper.ProductMapper;
import cn.tedu.coolshark.model.Banner;
import cn.tedu.coolshark.model.Product;
import cn.tedu.coolshark.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 17:23
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public void deleteById(int id) {
        //通过id查询到文件路径 然后删除文件
        String url = productMapper.selectUrlById(id);
        new File("d:/files"+url).delete();
        productMapper.deleteById(id);
    }

    @Override
    public String selectUrlById(int id) {
        return productMapper.selectUrlById(id);
    }
}
