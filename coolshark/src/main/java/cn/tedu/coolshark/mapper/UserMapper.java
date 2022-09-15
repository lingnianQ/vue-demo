package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:37
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where name=#{name}")
    User selectByUserName(String name);
}
