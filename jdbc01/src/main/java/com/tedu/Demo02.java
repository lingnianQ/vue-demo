package com.tedu;

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
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://176.17.100.105:3306/empdb", "root", "root"
        );

        Statement statement = conn.createStatement();
        String sql = "DROP TABLE IF EXISTS `jdbc1`;";
        statement.execute(sql);
        conn.close();
        System.out.println("删除成功");
    }
}
