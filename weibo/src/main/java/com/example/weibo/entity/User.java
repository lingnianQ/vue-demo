package com.example.weibo.entity;

import lombok.Data;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/13 17:34
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer age;
}
