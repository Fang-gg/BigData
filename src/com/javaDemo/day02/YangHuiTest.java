package com.javaDemo.day02;

public class YangHuiTest{
    public static void main(String[] args){
        int[][] yangHui = new int[10][];//1.声明并且初始化二维数组,动态声明。
        //2.给数组的元素赋值
        for(int i = 0;i < yangHui.length;i++){
            yangHui[i] = new int[i + 1];
            //2.1 给杨辉三角首末元素赋值
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
            //2.2 给杨辉三角每行非首末元素赋值
            if(i > 1){
                for(int j = 1;j < yangHui[i].length-1;j++){
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
            }

        }
        //遍历二维数组
        for(int i = 0;i < yangHui.length;i++){
            for(int j = 0;j < yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
