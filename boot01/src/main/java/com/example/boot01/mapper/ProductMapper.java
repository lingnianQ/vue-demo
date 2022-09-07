package com.example.boot01.mapper;

import com.example.boot01.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 10:54
 */
@Mapper
public interface ProductMapper {
    /**
     * 删除商品
     * @return
     */
    @Delete("delete from t_product where id=#{id}")
    boolean deleteById(int id);
    /**
     * 查询所有商品
     * @return
     */
    @Select("select * from t_product")
    List<Product> findAll();
    /**
     * 添加商品
     * 插入商品信息
     * @param product
     * @return
     */
    @Insert("insert into t_product values(null,#{title},#{price},#{num})")
    int save(Product product);
}
