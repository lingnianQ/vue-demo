package com.example.boot05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BmiEmp {
    private Double height;
    private Double weight;
}
