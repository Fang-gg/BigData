package com.HSPJava.day04;
/*
*   随机生成10个整数(1-100范围之内的)保存到数组，并倒序打印以及求平均值，最大值和最大值下标，并查找里面是不是有8；
*
* */
public class Test3 {
    public static void main(String[] args){
        //定义一个一维数组
        int[] arr = new int[10];
        //随机生成并且放入数组中
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*100 + 1);
        }
        //倒序打印数组
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 8){
                System.out.println("方世涛是帅哥");
                break;
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
