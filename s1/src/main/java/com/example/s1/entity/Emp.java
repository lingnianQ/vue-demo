package com.example.s1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 16:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private String name;
    private String salary;
    private String job;
}
