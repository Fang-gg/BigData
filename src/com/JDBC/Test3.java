package com.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/*
 *   在JDBC中 以后使用PreparedStatement
 *   因为使用Statement时会存在SQL注入问题
 *   以下是SQL注入演示
 * */
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        Scanner scanner = new Scanner(System.in);
        //让用户输入管理员和密码
        System.out.println("请输入管理员的名字:");

        String admin_user = scanner.nextLine();//如果需要看到SQL注入演示效果，就需要用nextLine()方法，因为next()方法会自动屏蔽掉空格

        System.out.println("请输入管理员的密码");
        String admin_pwd = scanner.nextLine();


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
        //获取Statement
        Statement statement = connection.createStatement();
        //写sql
        String sql = "select ename,deptno from test where ename = '" + admin_user + "' and deptno = '"+ admin_pwd + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()){//如果查询到记录，就说明存在
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
