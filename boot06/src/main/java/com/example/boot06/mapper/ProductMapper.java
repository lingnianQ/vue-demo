package com.example.boot06.mapper;

import com.example.boot06.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 10:52
 */
@Mapper
public interface ProductMapper {

    @Select("select * from t_product where id=#{id}")
    Product selectById(int id);

    @Update("update t_product set title=#{title},price=#{price},num=#{num} where id=#{id}")
    void update(Product product);

    @Delete("delete from t_product where id=#{id}")
    int deleteById(int id);

    @Select("select * from t_product")
    List<Product> findAll();

    @Insert("insert into t_product values(null,#{title},#{price},#{num})")
    int save(Product product);
}
