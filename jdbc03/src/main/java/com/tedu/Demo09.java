package com.tedu;

import com.tedu.entity.User;
import com.tedu.utils.DBUtils;

import java.sql.*;

/**
 * register
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 9:11
 */

public class Demo09 {
    public static void main(String[] args) {
        try (Connection conn = DBUtils.getConnection();) {

            String sql = "select id from t_user where name =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            User user = new User();
            user.setName("lingnian3");
//            user.setPassword("123456");
            user.setPassword("'or '1'='1");

            user.setNick("Q.");
            ps.setString(1, user.getName());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("用户名存在！");
                return;
            }

            String sql2 = "insert into t_user values(null,?,?,?)";
            ps = conn.prepareStatement(sql2);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNick());

            ps.execute();

            System.out.println("注册成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
