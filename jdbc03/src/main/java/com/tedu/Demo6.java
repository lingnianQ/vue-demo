package com.tedu;

import com.tedu.entity.User;
import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 9:11
 */

public class Demo6 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        User user = new User();
        user.setName("lingnian");
        user.setPassword("123456");
        user.setNick("Q.");
        boolean i1 = statement.execute("select id from t_user where name ='" + user.getName() + "'");
        if (i1) {
            System.out.println("用户已存在!");
            return;
        }

        System.out.println("i1: " + i1);
        String sql = "insert into t_user values(null ,'" + user.getName() + "','" + user.getPassword() + "','" + user.getNick() + "') ";
        int i = statement.executeUpdate(sql);
        System.out.println("i: " + i);

        System.out.println("注册成功");
        conn.close();

    }
}
