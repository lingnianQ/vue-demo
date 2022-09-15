package cn.tedu.coolshark.model;

import lombok.Data;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:30
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String nick;
}
