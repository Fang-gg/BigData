package com.javaDemo.day04;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数:");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("最大数是:" + a);
        }else if(b > a && b > c){
            System.out.println("最大数是:" + b);
        }else{
            System.out.println("最大数是:" + c);
        }



    }
}
