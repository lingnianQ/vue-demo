package com.example.weibo.mapper;

import com.example.weibo.entity.Weibo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/14 15:01
 */

@Mapper
public interface WeiboMapper {
    /*    CREATE TABLE weibo(
            id INT PRIMARY KEY auto_increment,
            content VARCHAR(255),
            urls text,
            created TIMESTAMP,
            user_id int,
            nick VARCHAR(255)
        )*/
    @Insert("insert into weibo values(null,#{content},#{urls},#{created},#{userId},#{nick})")
    void insert(Weibo weibo);

    @Select("select id,content,urls,nick from weibo")
    List<Weibo> select();

    @Select("select id,content,urls,nick,created from weibo where id=#{id}")
    Weibo selectById(int id);
}
