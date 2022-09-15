package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 11:04
 */
@Mapper
public interface BannerMapper {

    @Select("select id,url from t_banner")
    List<Banner> findAll();
}
