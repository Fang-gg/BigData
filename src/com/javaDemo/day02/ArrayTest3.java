package com.javaDemo.day02;

/*
排序算法
1.数组的冒泡排序的实现
 */
public class ArrayTest3 {
    public static void main(String[] args){
        int[] arr = new int[]{11,14,2,6,8,3,9,33,99,344,855,32,16,};
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //数组的遍历
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
