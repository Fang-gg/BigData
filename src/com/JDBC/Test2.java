package com.JDBC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
*  JDBC中的select查询
*
* */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
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

        //得到Statement
        Statement statement = connection.createStatement();

        //写sql语句
        String sql = "select * from test";
        ResultSet resultSet = statement.executeQuery(sql);

        //使用while取出数据
        while(resultSet.next()){//让光标向后移动，如果没有更多行，就返回false
            int empno = resultSet.getInt(1);//获取该行的第一列数据
            String ename = resultSet.getString(2);//获取改行的第二列
            String job = resultSet.getString(3);
            System.out.println(empno + "\t" + ename + "\t" + "job");
        }
        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
