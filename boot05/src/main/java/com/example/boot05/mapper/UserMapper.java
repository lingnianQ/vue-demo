package com.example.boot05.mapper;

import com.example.boot05.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 9:46
 */
@Mapper
public interface UserMapper {
    @Select("select password from t_user where name = #{name}")
    String findByUsername(String name);

    @Select("select * from t_user where name = #{name}")
    User findUser(String name);
}
