package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:06
 */

public class Demo02 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql = "insert  into car values (null ,'法拉利','跑车',6666),(null ,'奔驰','轿车',5555),(null ,'奥迪','SUV',5555)";
        statement.executeUpdate(sql);
        conn.close();
    }
}
