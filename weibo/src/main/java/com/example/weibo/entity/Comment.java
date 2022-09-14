package com.example.weibo.entity;

import lombok.Data;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/14 17:10
 */
@Data
public class Comment {
    private Integer id;
    private String content;
    private String nick;
    private Integer weiboId;
}
