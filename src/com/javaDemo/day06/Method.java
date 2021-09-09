package com.javaDemo.day06;
import java.util.Scanner;
public class Method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();

        int sum = number(a,b);
        System.out.println("和为:" + sum);
//            number(10,20);

    }

    public static int number(int x,int y){
        int z = x + y;
        return z;
//        System.out.println(x + " + " + y + " = " + z);
    }

}

