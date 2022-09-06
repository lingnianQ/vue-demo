package com.tedu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:18
 */

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
          "jdbc:mysql://176.17.100.105:3306/empdb","root","root"
        );
    }
}
