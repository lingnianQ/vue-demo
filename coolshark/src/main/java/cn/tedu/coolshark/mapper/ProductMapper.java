package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.model.Banner;
import cn.tedu.coolshark.model.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 17:22
 */
@Mapper
public interface ProductMapper {
    @Insert("insert into t_product values(null,#{title},#{url},#{price},#{oldPrice}" +
            ",#{saleCount},#{num},0,#{created},#{categoryId})")
    void insert(Product product);

    //通过Result注解解决属性名和表字段不一致的情况
    //    @Select("select id,title,price,old_price,sale_count,url from product")
//    @Result(column = "old_price",property = "oldPrice")
//    @Result(column = "sale_count",property = "saleCount")
//    List<Product> select();
    //通过别名解决属性名和表字段不一致的情况
//    @Select("select id,title,price,old_price oldPrice,sale_count saleCount,url from product")
//    List<Product> select();

    //如果仅仅是因为驼峰命名和_命名规范导致的不一致 可以在application.properties中添加
    //配置信息解决
    @Select("select id,title,price,old_price,sale_count,url from t_product")
    List<Product> findAll();

    @Select("select url from t_product where id=#{id}")
    String selectUrlById(int id);

    @Select("select * from t_product where id=#{id}")
    Product selectById(int id);

    @Delete("delete from t_product where id=#{id}")
    void deleteById(int id);

    @Select("select id,title,sale_count from t_product order by sale_count desc limit 0,6")
    List<Product> selectTop();

    @Select("select id,title,price,old_price,sale_count,url from t_product")
    List<Product> selectIndex();

    @Select("select id,title,price,old_price,sale_count,url from t_product where category_id=#{id}")
    List<Product> selectByCid(int id);
    //
    @Select("select id,title,price,old_price,sale_count,url from t_product where title like concat('%',#{wd},'%')")
    List<Product> selectByWd(String wd);
}
