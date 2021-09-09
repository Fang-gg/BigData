package com.JDBC;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) throws Exception{
        //使用反射加载Driver
        Class.forName("com.mysql.jdbc.Driver");

        //创建url和user和password
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        String user = "root";
        String password = "fst19990222";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

        //写sql语句
        String sql = "update test set ename = 'fangshi' where empno = 7499";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i>0?"成功":"失败");

        connection.close();
        statement.close();
    }
    @Test
    //在上述情况下进行改进,增加配置文件，让连接mysql更加灵活
    public void connect() throws IOException, ClassNotFoundException, SQLException {
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }


    @Test
    public void connect1() throws IOException, ClassNotFoundException, SQLException {
        //获取配置文件信息
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
        String sql = "update test set ename = 'woaini' where deptno = 30";

        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i>0?"成功":"失败");
        statement.close();
        connection.close();
    }


}
