package com.HSPJava.day02;

import java.util.Scanner;

/*
*       根据用于指定月份，打印该月份所属的季节
*       3，4，5春季   6，7，8夏季   9，10，11秋季     12，1，2冬季
*
* */
public class Month {
    public static void main(String[] args){
        //键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入指定的月份:");
        int month = scanner.nextInt();
        //switch
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("你输入的月份有错误，请重新输入(1-12):");
        }
    }
}
