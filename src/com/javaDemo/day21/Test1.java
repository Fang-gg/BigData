package com.javaDemo.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
* 从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
*          用到的缓冲流是字符缓冲流   BufferedReader
* */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.创一个集合对象
        ArrayList<String> list = new ArrayList<String>();
        //2.造一个读取缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("array.txt"));
        //3.读取数据到集合
        String  line = null;
        while((line = bufferedReader.readLine()) != null){
            list.add(line);
        }
        //4.遍历集合
        for(String s : list){
            System.out.println(s);
        }
        //5.关闭流
        bufferedReader.close();
    }
}
