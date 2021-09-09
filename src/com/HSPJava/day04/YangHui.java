package com.HSPJava.day04;
/*
*       用二维数组打印1个10行杨辉三角
*
* */
public class YangHui {
    public static void main(String[] args){
        //定义一个二维数组 只知道有多少行
        int[][] arr = new int[10][];
        //开辟二维数组里面一维数组的空间
        for (int i = 0; i < arr.length; i++) {
            //给每个一维数组开辟空间
            arr[i] = new int[i + 1];
            //开始赋值
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //打印杨辉三角
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
