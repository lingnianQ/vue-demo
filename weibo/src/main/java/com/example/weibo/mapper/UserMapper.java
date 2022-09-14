package com.example.weibo.mapper;

import com.example.weibo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/13 17:34
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    User selectById(Integer id);
    @Select("select * from t_user where name=#{name}")
    User selectByName(String name);
    @Insert("insert into t_user values(null,#{name},#{password},#{nick})")
    void insert(User user);
}
