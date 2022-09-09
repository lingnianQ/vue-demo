package com.example.boot06.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/9 10:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;

    private String title;

    private Double price;

    private Integer num;
}
