package com.HSPJava.day02;
/*
*       三元运算符实现求三个数中的最大数
* */
public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max1 = a > b ? a : b;
        int max2 = c > max1 ? c : max1;
        System.out.println("最大值是:" + max2);
    }
}
