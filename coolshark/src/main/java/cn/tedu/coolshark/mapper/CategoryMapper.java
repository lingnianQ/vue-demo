package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
