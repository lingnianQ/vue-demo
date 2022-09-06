package com.tedu;

import com.tedu.utils.DBUtils;

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
        Connection conn = DBUtils.getConnection();
        Statement statement = conn.createStatement();
        String sql = " create table car (id int not null AUTO_INCREMENT,title varchar(255) ,type varchar(255) ,price int, PRIMARY key (id) using BTREE)";
        statement.execute(sql);
        conn.close();
    }
}
