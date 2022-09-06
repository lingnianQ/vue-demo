package com.tedu;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 17:00
 */

public class Demo05 {
    public static void main(String[] args) throws SQLException {
        //创建数据库连接池
        DruidDataSource dds = new DruidDataSource();
        //设置连接数据库信息
        dds.setUrl("jdbc:mysql://176.17.2.231:3306/empdb");
        dds.setUsername("root");
        dds.setPassword("root");
        //设置初始连接数量
        dds.setInitialSize(3);
        //设置最大连接
        dds.setMaxActive(5);
        //获取连接对象 异常抛出
        DruidPooledConnection conn = dds.getConnection();

    }
}
