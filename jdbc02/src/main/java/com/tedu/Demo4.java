package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:20
 */

public class Demo4 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql = "update hero set name ='齐天大圣' where name ='孙悟空';";
        statement.executeUpdate(sql);
        conn.close();
    }
}
