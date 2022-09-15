package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 10:28
 */

@Mapper
public interface CategoryMapper {
    @Select("select * from t_category")
    List<Category> findAll();

    @Delete("delete from t_category where id=#{id}")
    void deleteById(int id);

    @Insert("insert into t_category values(null,#{name})")
    void insert(String name);

    @Update("update t_category set name=#{name} where id=#{id}")
    void update(Category category);
}
