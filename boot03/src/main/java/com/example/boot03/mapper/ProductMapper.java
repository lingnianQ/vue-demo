package com.example.boot03.mapper;

import com.example.boot03.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 16:54
 */
@Mapper
public interface ProductMapper {

    @Insert("insert into product values(null,#{title},#{price},#{num})")
    int insert(Product product);

}
