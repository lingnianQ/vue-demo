package com.tedu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:48
 */

public class DBUtils {

    private static DruidDataSource dds;

    static {
        //创建数据库连接池
        dds = new DruidDataSource();
        //设置连接数据库信息
        dds.setUrl("jdbc:mysql://176.17.2.231:3306/empdb");
        dds.setUsername("root");
        dds.setPassword("root");
        //设置初始连接数量
        dds.setInitialSize(3);
        //设置最大连接
        dds.setMaxActive(5);
    }

    public static Connection getConnection() throws SQLException {
        DruidPooledConnection conn = dds.getConnection();
        System.out.println("连接:"+conn);
        return conn;
    }
}
