package com.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 14:38
 */

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://176.17.2.231:3306/empdb", "root", "root"
        );

        Statement s = conn.createStatement();
        String sql = "create table jdbc1(name varchar(20),age int);";
        s.execute(sql);

        System.out.println(conn);
        conn.close();
        System.out.println("创建成功");
    }
}
