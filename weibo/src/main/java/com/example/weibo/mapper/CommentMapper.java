package com.example.weibo.mapper;

import com.example.weibo.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/14 18:02
 */

@Mapper
public interface CommentMapper {


    @Insert("insert into t_comment values(null,#{content},#{nick},#{weiboId})")
    void insert(Comment comment);

    @Select("select id,content,nick from t_comment where weibo_id=#{id}")
    List<Comment> selectByWeiboId(int id);
}
