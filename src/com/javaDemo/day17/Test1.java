package com.javaDemo.day17;

import java.io.File;
import java.io.IOException;

/*
* File类的相关用法
*         创建功能
               public boolean createNewFile()
               public boolean mkdir()
               public boolean mkdirs()
* */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("D:\\demo");
        //public boolean mkdir()
        System.out.println(file.mkdir());
        //public boolean createNewFile()
        File file1 = new File("D:\\demo\\fst.txt");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //public boolean mkdirs()
//        File file = new File("D:\\demo1\\demo2\\demo3");
//        System.out.println(file.mkdirs());
        File file2 = new File("D:\\demo\\fst.txt");
        System.out.println(file2);

        File file3 = new File("D:\\兰智数加\\上课视频\\第二十天");
        System.out.println(file3.canRead());
        System.out.println(file3.canWrite());
        System.out.println("--------------------------------------");
        //public String[] list(),获取指定目录下的所有文件或者文件夹的名称数组
        String[] list = file3.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        //public File[] listFiles(),获取指定目录下的所有文件或者文件夹的File数组
        File[] files = file3.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
