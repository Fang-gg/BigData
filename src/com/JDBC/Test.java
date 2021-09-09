package com.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/*
* 第一个Jdbc程序
*
* */
public class Test {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();

        //2.得到连接
        String url = "jdbc:mysql://localhost:3306/bjpowernode";
        Properties properties = new Properties();
        //说明: user和 password是规定好的
        properties.setProperty("user","root");//用户
        properties.setProperty("password","fst19990222");//密码
        Connection connect = driver.connect(url, properties);
        //3.执行sql语句
        String sql = "delete from test where empno = 7369";
        Statement statement = connect.createStatement();//发送sql语句
        //如果是DML语句，返回的就是影响行数
        int i = statement.executeUpdate(sql);
        System.out.println(i > 0? "成功":"失败");

        //4.关闭连接
        statement.close();
        connect.close();
    }
}

