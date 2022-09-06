package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:24
 */

public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql="delete c from car as c ,(select max(id) AS max_id from car ) as m where c.id=m.max_id;";
        statement.executeUpdate(sql);
        conn.close();
    }
}
