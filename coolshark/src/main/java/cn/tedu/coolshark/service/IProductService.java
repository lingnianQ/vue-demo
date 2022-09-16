package cn.tedu.coolshark.service;

import cn.tedu.coolshark.model.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 17:22
 */

public interface IProductService {

    List<Product> selectByCid(int id);

    List<Product> selectByWd(String wd);

    List<Product> selectTop();

    Product selectById(int id);

    void insert(Product product);

    List<Product> findAll();

    void deleteById(int id);

    List<Product> selectIndex();

    String selectUrlById(int id);
}
