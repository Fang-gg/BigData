package com.javaDemo.day17;

import java.io.File;
import java.util.ArrayList;

/*
* 判断D盘D:\兰智数加\上课视频\第二十天下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 *      分析：
 *          1、获取到D:\兰智数加\上课视频\第二十天
 *          2、获取该目录下所有的文件和文件夹的File数组
 *          3、遍历该File数组，得到每一个File对象，然后判断是否是文件
 *          4、判断是否是文件
 *              是：继续判断是否是以.jpg后缀
 *                  是：输出该文件名称
 *                  否：不管他
 *              否：不管他
*
* */
public class Test2 {
    public static void main(String[] args){
        //1.获取到D:\兰智数加\上课视频\第二十天
        File file = new File("D:\\兰智数加\\上课视频\\第二十天");
        System.out.println(file);
        //2.获取该目录下所有的文件和文件夹的File数组
//        File[] files = file.listFiles();
//        for(File f : files){
//           if(f.isFile()){
//               if(f.getName().endsWith(".jpg")){
//                   System.out.println(f.getName());
//               }
//
//           }
//        }
        //改进如下
        //定义一个来收集有多少需要找到的文件
        int count = 0;
        //定义一个集合来存储名字
        ArrayList<String> strings = new ArrayList<String>();
        //获取该目录下的所有文件和文件夹的File数组
        File[] files = file.listFiles();
        for(File f : files){
            if(f.getName().endsWith(".java")){//只要修改这里面的.java 就可以查到其他文件了
                count++;
                strings.add(f.getName());
            }
        }
        //输出
        System.out.println("一共有" + count + "个文件");
        System.out.println("分别如下:");
        //遍历集合操作
        for(String s : strings){
            System.out.println(s);
        }


    }
}
