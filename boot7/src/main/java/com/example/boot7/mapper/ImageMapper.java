package com.example.boot7.mapper;

import com.example.boot7.entity.Image;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/13 15:16
 */
@Mapper
public interface ImageMapper {

    @Insert("insert into t_image values(null,#{intro},#{urls})")
    void insert(Image image);

    @Select("select * from t_image")
    List<Image> select();

    @Delete("delete from t_image where id = #{id}")
    void delById(Integer id);

    @Select("select * from t_image where id = #{id}")
    Image selectById(Integer id);
}
