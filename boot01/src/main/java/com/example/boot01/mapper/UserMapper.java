package com.example.boot01.mapper;

import com.example.boot01.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 18:43
 */
@Mapper
public interface UserMapper {
    /**
     * 查找全部用户
     * @return
     */
    @Select("select * from t_user")
    List<User> findAll();

    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    @Select("select * from t_user where name=#{name}")
    User findByUsername(String name);

    /**
     * register
     * @param name
     * @param password
     * @param age
     * @return
     */
    @Insert("insert into t_user values(null,#{name},#{password},#{age})")
    int save(String name, String password, Integer age);
}
