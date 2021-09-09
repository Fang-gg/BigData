package com.javaDemo.day02;
//创建一个长度为6的int型数组，要求数组元素的值都在1~30之间，且是随机赋值。同时要求元素的值各不相同。
public class RandomNumber {
    public static void main(String[] args){
        int[] number = new int[6];//声明一个一维数组
        for(int i = 0;i < number.length;i++){
            number[i] = (int)(Math.random() * 30) + 1;  //Math.random()随机数取值是在[0.0,1),为double型数值
            for(int j = 0;j < i;j++){
                if(number[i] == number[j]){
                    i--;
                    break;
                }
            }
        }
        //遍历一维数组
        for(int i = 0;i < number.length;i++)
            System.out.println(number[i]);
    }
}
