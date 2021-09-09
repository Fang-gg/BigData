package com.HSPJava.day04;

public class Test1 {
    public static void main(String[] args){
        int[][] arr = new int[3][];
        for(int i = 0;i < arr.length;i++){
            //给每个一维数组开空间 new
            arr[i] = new int[i + 1];
            //遍历一维数组，并给一维数组的每个元素赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
