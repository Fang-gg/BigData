package com.HSPJava.day03;

import java.util.Scanner;

/*
*   数组的缩减
*   现在有一个数组{1，2，3，4，5}，可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素，当只剩下最后一个元素，
*   提示，不能再缩减了。
*
* */
public class Array2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //定义数组
        int[] arr = new int[]{1,2,3,4,5};
        if (arr.length != 1) {
        while (true) {
                //定义缩减数组
                int[] arr1 = new int[arr.length - 1];

                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = arr[i];
                }
                //将arr1的地址值赋给arr
                arr = arr1;
            if(arr.length == 1) {
                System.out.println("注意！已经缩减到最后一个元素了，不能再缩减了！！！");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t");
                }
                break;
            }
                //输出缩减之后的数组
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + "\t");
                }
            System.out.println();
            }
        }
    }
}
