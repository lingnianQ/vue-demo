package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:20
 */

public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql = "delete from hero where name ='猪八戒';";
        statement.executeUpdate(sql);
        conn.close();
    }
}
