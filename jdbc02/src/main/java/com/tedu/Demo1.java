package com.tedu;

import com.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 16:20
 */

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();
        String sql = "create table hero (id int not null AUTO_INCREMENT,name varchar(20),age int,PRIMARY KEY (`id`) USING BTREE);";
        Statement statement = conn.createStatement();
        statement.execute(sql);
        conn.close();
        System.out.println("创建hero表完成");
    }
}
