package com.tedu;

import java.sql.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/5 15:24
 */

public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://176.17.2.231:3306/empdb", "root", "root"
        );
        Statement statement = conn.createStatement();
//        String sql ="insert into emp(name) values('何坚')";
//        String sql ="update emp set name ='Tom' where name ='何坚';";
//        String sql ="delete from emp where name ='Tom';";
        String sql = "select * from emp;";

        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            String name = rs.getString("name");
            double sal = rs.getDouble("sal");
            System.out.println(name + ":" + sal);
        }
//        statement.execute(sql);
        conn.close();
        System.out.println("执行完成");
    }
}
