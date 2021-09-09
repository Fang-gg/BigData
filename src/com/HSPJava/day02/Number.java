package com.HSPJava.day02;

import org.junit.Test;

/*
*       打印1-100之间所有是9的倍数的整数，统计个数及总和
*
* */
public class Number {
    public static void main(String[] args){
        //先定义个数 int count
        int count = 0;
        //定义总和 int sum
        int sum = 0;
        //遍历1-100之间的所有数
        for(int i = 1;i < 100;i++){
            //加入判断
            if(i % 9 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("总个数是:" + count + "总和是:" + sum);
    }

    @Test
    public void number(){
//       for(int i = 0;i < 5;i++){
//           System.out.println(i + "+" + (5-i) + "=" + 5);
//       }

       //优化代码如下
        int n = 5;//只需要改n的值就可以
       for(int i = 0;i < n;i++){
           System.out.println(i + "+" + (n-i) + "=" + n);
       }
    }


}

