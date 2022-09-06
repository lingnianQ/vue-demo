package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:20
 */

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        String sql ="insert into hero values (null,'孙悟空',500),(null ,'猪八戒',300);";
        Statement statement = conn.createStatement();
        statement.execute(sql);
        conn.close();
        System.out.println("插入完毕");
    }
}
