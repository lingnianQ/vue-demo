package com.tedu;

import com.tedu.entity.User;
import com.tedu.utils.DBUtils;

import java.sql.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 10:10
 */

public class Demo7 {
    public static void main(String[] args) {
        try (Connection conn = DBUtils.getConnection();) {
//            Statement statement = conn.createStatement();
            String sql = "select count(*) from t_user where name=? and password=?;";
            User user = new User();
            user.setName("lingnian");
            //SQL注入
//            user.setPassword("'or '1'='1");
            user.setPassword("123456");
            user.setNick("Q.");

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());

//            ResultSet rs = statement.executeQuery("select count(*) from t_user where name='" + user.getName() + "' and password= '" + user.getPassword() + "'");
            ResultSet rs = ps.executeQuery();
            //游标向下移动
            rs.next();
            int count = rs.getInt(1);
            if (count > 0) {
                System.out.println("登陆成功！");
            } else {
                System.out.println("用户名或密码错误！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
