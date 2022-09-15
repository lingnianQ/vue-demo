package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.Banner;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 11:04
 */
@Mapper
public interface BannerMapper {

    @Insert("insert into t_banner values(null,#{url})")
    void insert(String url);

    @Select("select id,url from t_banner")
    List<Banner> findAll();

    @Delete("delete from t_banner where id=#{id}")
    void deleteById(int id);
}
