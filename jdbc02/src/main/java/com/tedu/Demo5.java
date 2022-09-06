package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:20
 */

public class Demo5 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql = "select name ,age from hero;";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(name + ":" + age);
        }
        conn.close();
    }
}
