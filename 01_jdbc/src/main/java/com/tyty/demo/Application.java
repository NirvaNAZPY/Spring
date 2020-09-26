package com.tyty.demo;

/**
 * Created by TYTY on 2020/9/15 17:12
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 程序的耦合
 */
public class Application {
    public static void main(String[] args) throws Exception{
        /**
         * 1.注册驱动
         * 2.获取连接
         * 3.获取操作数据库的预处理对象
         * 4.执行SQL,得到结果集
         * 5.遍历结果集
         * 6.释放资源
         */
        // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springdemo?serverTimezone=UTC","root","zpy@mysql");
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        pstm.close();
        conn.close();
    }
}
