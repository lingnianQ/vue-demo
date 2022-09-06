package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:51
 */

public class Demo4 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql="update car set title='奔驰',type='suv',price=111 where id=4 or id=5;";
        statement.execute(sql);
        conn.close();
    }
}
