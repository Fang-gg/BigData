package com.HSPJava.day03;

import org.junit.Test;

/*
*       数组的反转
*       给定如下数组 {11,22,33,44,55,66}---------->{66,55,44,33,22,11}
*                                     经过反转变成
*
* */
public class Array1 {
    public static void main(String[] args){
        //定义数组
        int[] arr = new int[]{11,22,33,44,55,66};
        int temp;
        //遍历数组
        for(int i = 0;i < arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("反转之后的数组如下所示:");
        //输出
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    @Test//反转方式2
    public void array(){
        int[] arr = new int[]{11,22,33,44,55,66};
        int[] arr1 = new int[arr.length];//开辟一个空间和arr数组一样大小的数组arr1
        //遍历原数组arr
        for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[arr.length - 1 - i];
        }
        //将arr1的地址给到arr
        arr = arr1;
        //输出反转之后的数组
        System.out.println("反转之后的数组如下所示:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
