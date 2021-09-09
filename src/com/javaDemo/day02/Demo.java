package com.javaDemo.day02;

/*public class Demo{
    public static void main(String[] args) {
        int[] arr = new int[] {8,2,1,0,3};
        int[] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for(int i = 0;i < index.length;i++){
            tel += arr[index[i]];//18013820100
        }
        System.out.println("联系方式: " + tel);
    }
}*/
/*

import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//使用Scanner，读取个数。
        System.out.println("学生个数:");
        int number = scanner.nextInt();
        //创建数组，存储学生个数，动态初始化
        int[] scores = new int[number];
        //给数组元素赋值
        System.out.println("请输入" + number + "个学生成绩:");
        for(int i = 0;i < scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        //获取数组中的元素最大值；最高分
        int maxScores = 0;
        for(int i = 0;i < scores.length;i++){
            if(maxScores < scores[i]){
                maxScores = scores[i];
            }
        }

        //根据每个学生成绩与最高分的差值，得到每个学生的等级并且输出。
        char level;
        for(int i = 0;i < scores.length;i++) {
            if (maxScores - scores[i] <= 10){
                    level = 'A';
            }else if(maxScores - scores[i] <= 20){
                    level = 'B';
            }else if(maxScores - scores[i] <= 30){
                    level = 'C';
            }else{
                    level = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + ",grade is " + level);

        }
    }
}*/


