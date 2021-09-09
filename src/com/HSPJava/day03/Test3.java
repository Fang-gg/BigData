package com.HSPJava.day03;

import org.junit.Test;

/*
*       判断一个整数是不是水仙花数
*       所谓的水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
*
* */
public class Test3 {
    public static void main(String[] args){
        int a;//定义a是这个三位数的个位
        int b;//十位
        int c;//百位
        //遍历全部的三位数
        for(int i = 100;i < 1000;i++){
            a = i % 10;
            b = i / 10 % 10;
            c = i / 10 /10;
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println(i + "是水仙花数");
            }
        }
    }

    @Test
    public void number(){//输出1-100之间的不能被5整除的数，每5个一行
        int count = 0;//定义每一次是否达到5或者5的倍数
        for(int i = 1;i <= 100;i++){
            if (i % 5 != 0){
                System.out.print(i + "\t");
                count++;
            }
            if(count % 5 == 0){//每5个一行
                System.out.println();
            }
        }
    }
}
