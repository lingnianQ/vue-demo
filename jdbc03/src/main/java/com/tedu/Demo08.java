package com.tedu;

import com.tedu.entity.User;
import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * login
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 11:22
 */

public class Demo08 {
    public static void main(String[] args) {
        try (Connection conn = DBUtils.getConnection();) {
//            Statement statement = conn.createStatement();
            String sql = "select password from t_user where name=?;";
            User user = new User();
            user.setName("lingnian");
            //SQL注入
//            user.setPassword("'or '1'='1");
            user.setPassword("123456");
            user.setNick("Q.");

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());

//            ResultSet rs = statement.executeQuery("select count(*) from t_user where name='" + user.getName() + "' and password= '" + user.getPassword() + "'");
            ResultSet rs = ps.executeQuery();
            //游标向下移动
            if (rs.next()) {
                if(rs.getString("password").equals(user.getPassword())){
                    System.out.println("登陆成功");
                }else {
                    System.out.println("密码错误");
                }
            }else {
                System.out.println("用户名不存在");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
