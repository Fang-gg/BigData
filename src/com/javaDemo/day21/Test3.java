package com.javaDemo.day21;

import java.io.*;
import java.util.Arrays;

/*
* 已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
     请编写程序读取数据内容，把数据排序后写入ss.txt中。
* */
public class Test3 {
    public static  void main(String[] args){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //排序有一个Arrays工具类
            //先字符输入缓冲流
            bufferedReader = new BufferedReader(new FileReader("s.txt"));
            String s = bufferedReader.readLine();
            //把字符串转化成字符数组
            char[] chars = s.toCharArray();
            //通过Arrays工具类进行排序
            Arrays.sort(chars);
            //把字符数组转化成字符串
            String s1 = new String(chars);
            //创建字符输出缓冲流
            bufferedWriter = new BufferedWriter(new FileWriter("ss.txt"));
            bufferedWriter.write(s1);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null){
                //关闭流
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedReader != null){
                //关闭流
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
