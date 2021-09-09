package com.javaDemo.day07;

/*
 * 1.	数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词
 *       程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
 *
 *
 * */
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要查找的单词:");
        String a = sc.next();
        String[] arr = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < arr.length; i++) {
            if (a.equals(arr[i])) {
                System.out.println("yes");
                return;
            }
        }
        if(!a.equals(arr[arr.length-1])){
            System.out.println("no");
        }


        System.out.println("============================================================");
    }
}
