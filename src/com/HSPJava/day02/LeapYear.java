package com.HSPJava.day02;

import java.util.Scanner;

/*
*       判断一个年份是否是闰年，闰年的条件是符合下面二者之一:
*       (1)年份能被4整除，但不能被100整除
*       (2)能被400整除
*
* */
public class LeapYear {
    public static void main(String[] args){
        //从键盘输入年份
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要知道的年份:");
        int year = scanner.nextInt();
        //加入判断
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else {  System.out.println(year + "不是闰年");
        }

    }
}
