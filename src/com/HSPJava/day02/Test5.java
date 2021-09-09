package com.HSPJava.day02;
/*
*       随即生成1-100的一个数，知道生成了97这个数，看看一共用了多少次
*
* */
public class Test5 {
    public static void main(String[] args){
        int i = 97;
        int sum = 0;
        while ((int)(Math.random()*100 + 1) != i){
            sum++;
        }
        System.out.println("直到随机生成97，一共用了:" + sum + "次");
    }
}
