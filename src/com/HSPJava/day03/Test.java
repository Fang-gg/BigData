package com.HSPJava.day03;
/*
*       1-100以内的数求和，求出当和第一次大于20的当前数
*
* */
public class Test {
    public static void main(String[] args){
        int sum = 0;
        //遍历1-100以内的数
        for(int i = 1;i <= 100;i++){
            //判断
            if((sum += i) > 20){
                System.out.println("和大于20的时候，当前数是:" + i);
                break;
            }
        }
    }
}
