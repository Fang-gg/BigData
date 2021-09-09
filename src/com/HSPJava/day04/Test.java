package com.HSPJava.day04;
/*
*       冒泡排序24,59,80,57,13
*
* */
public class Test {
    public static void main(String[] args){
        //先定义一个数组存放数据
        int[] arr ={24,59,80,57,13};
        int temp;//用于辅助交换的变量
        //开始遍历
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //输出排序好之后的
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
