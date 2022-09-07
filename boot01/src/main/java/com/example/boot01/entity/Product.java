package com.example.boot01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 10:41
 */
@Entity(name = "t_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private Double price;

    private Integer num;

}
