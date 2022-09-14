package com.example.weibo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/14 15:00
 */

@Data
public class Weibo {
    private Integer id;
    private String content;
    private String urls;
    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒", timezone = "GMT+8")
    private Date created;//发布时间  导包Java.util
    private Integer userId;//作者id
    private String nick; //作者昵称
}
