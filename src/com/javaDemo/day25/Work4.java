package com.javaDemo.day25;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
*   试编写一个程序，输入一个字符串，统计其中有多少个单词？单词之间用空格分开。
* */
public class Work4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        for(String s2 : s1){
            System.out.println(s2);
            count++;
        }
        System.out.println("一共有" + count + "个单词");
    }
}

