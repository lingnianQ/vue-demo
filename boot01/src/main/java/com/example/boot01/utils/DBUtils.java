package com.example.boot01.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:48
 */

public class DBUtils {

    //私有变量
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    //静态块
    static {
        try {
            //1.新建属性集对象
            Properties properties = new Properties();
            //2.通过反射，新建字符输入流，读取db.properties文件
            InputStream input = DBUtils.class.getClassLoader().getResourceAsStream("db.properties");
            //3.将输入流中读取到的属性，加载到properties属性集对象中
            properties.load(input);
            //4.根据键，获取properties中对应的值
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static DruidDataSource dds;

    static {
        //创建数据库连接池
        dds = new DruidDataSource();
        //设置连接数据库信息
        dds.setUrl(url);
        dds.setUsername(user);
        dds.setPassword(password);
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
