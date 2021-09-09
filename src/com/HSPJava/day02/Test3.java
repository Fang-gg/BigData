package com.HSPJava.day02;

import java.util.Scanner;

/*
*       请编写一个程序，该程序可以接受一个字符，比如:a,b,....
*        a表示星期一，b表示星期二
*       根据用户输入显示相对应的信息
*       用switch语句完成
*
* */
public class Test3 {
    public static void main(String[] args){
        //从键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入对应的字符(a-g):");
        String next = scanner.next();
        char c = next.charAt(0);
        switch(c){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
                break;
            default:
                System.out.println("您输入的字符不正确，请重新输入。");
        }
    }
}
