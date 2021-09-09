package com.javaDemo.day21;

import java.io.*;
import java.util.ArrayList;

/*
* 把ArrayList集合中的字符串数据存储到文本文件
*
*       文本文件用的缓冲流是  BufferedWriter
 * */
public class Test {
    public static void main(String[] args){
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.给集合里面添加元素
        list.add("hello");
        list.add("world");
        list.add("big");
        list.add("data");
        BufferedWriter bufferedWriter = null;

        try {
            //3.造一个输出缓冲流
            bufferedWriter = new BufferedWriter(new FileWriter("array.txt"));

            //4.遍历集合并且读出
            for(String s : list){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null){
                //5.关闭流
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
