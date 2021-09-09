package com.HSPJava.day07;
/*
*   可变参数
*   有三个方法，分别实现返回姓名和两门课成绩(总分)，返回姓名和三门课成绩(总分),返回姓名和五门课成绩(总分)。
*   封装成一个可变参数的方法。
*
* */
public class Test {
    public static void main(String[] args){
        FstMethod fstMethod = new FstMethod();
        fstMethod.showScore("方世涛",10,20);
        fstMethod.showScore("方世涛1",10,20,30);
        fstMethod.showScore("方世涛2",10,20,33,44,55);


    }
}

class FstMethod{
    public void showScore(String name,int... score){
        int sumScore = 0;
        System.out.println(name);
        //可以把可变参数看成一个数组
        for(int i = 0;i < score.length;i++){
            sumScore += score[i];
        }
        System.out.print("总成绩是:" + sumScore);
        System.out.println();
    }
}
