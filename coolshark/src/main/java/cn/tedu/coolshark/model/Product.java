package cn.tedu.coolshark.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 10:21
 */
@Data
public class Product {
    private Integer id;
    private String title;
    private String url;
    private Double price;
    private Double oldPrice;
    private Integer saleCount;
    private Integer num;
    private Integer viewCount; //浏览量
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss",timezone = "GMT+8")
    private Date created;  //发布时间
    private Integer categoryId; //分类id
}
