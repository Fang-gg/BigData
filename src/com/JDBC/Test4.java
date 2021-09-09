package com.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/*
*   使用 PreparedStatement处理
*
* */
public class Test4 {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

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

        //获取PreparedStatement
        //1.1写sql
        String sql = "select ename,deptno from test where ename = ? and deptno = ?";
        //1.2获取连接
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //1.3 给?赋值
        preparedStatement.setString(1,admin_user);
        preparedStatement.setString(2,admin_pwd);

        //执行select语句
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){//如果查询到记录，就说明存在
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

        //关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
