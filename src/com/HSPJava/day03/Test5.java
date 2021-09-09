package com.HSPJava.day03;
/*
*       请求出一个数组int[]的最大值{4,-1,9,10,23},并且得到对应的下标
*
* */
public class Test5 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[]{4, -1, 9, 10, 23};
        int max = arr[0];//先定义一个最大值
        int number = 0;//来记录最大值对应的下标
        //遍历
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >= max){
                max = arr[i];
                number = i;
            }
        }
        System.out.println("最大值为:" + max + "此时对应的下标是:" + number);
    }
}
