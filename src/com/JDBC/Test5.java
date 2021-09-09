package com.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/*
*   preparedStatement进行DML语句
*
* */
public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        //让用户输入管理员和密码
        System.out.println("请输入号码:");

        String deptno = scanner.nextLine();//如果需要看到SQL注入演示效果，就需要用nextLine()方法，因为next()方法会自动屏蔽掉空格
//
//        System.out.println("请输入名字:");
//        String dname = scanner.nextLine();
//
//        System.out.println("请输入地址:");
//        String loc = scanner.nextLine();

        //加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //注册驱动
        Class.forName(driver);

        //建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //写sql
//        String sql = "insert into dept values(?,?,?)";
        String sql = "delete from dept where deptno = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,deptno);
//        preparedStatement.setString(2,dname);
//        preparedStatement.setString(3,loc);

        int i = preparedStatement.executeUpdate();
        System.out.println(i>0?"成功":"失败");

        preparedStatement.close();
        connection.close();
    }
}
