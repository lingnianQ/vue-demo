package cn.tedu.coolshark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String status;
}
