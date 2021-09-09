package com.javaDemo.day02;


/*
1.定义一个int型的一维数组，包含10个元素，分别赋一些随机数值
2.要求求出所有元素的最大值，最小值，总和，平均值，并且输出
3.要求所有随机数都是两位数
 求随机数公式
  Math.random()随机数取值是在[0.0,1),为double型数值、
  因此要是想要所有随机数都是两位数，那就得
  (Math.random() * (99 - 10 + 1) + 10);
*/
/*public class Random {
    public static void main(String[] args){
        int[] number = new int[10];
        for(int i = 0;i < number.length;i++){
            number[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }
        //遍历一维数组
        for(int i = 0;i < number.length;i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    //求最大值，最小值，总和，平均值。
    //1.最大值
        int maxValue = number[0];
        for(int i = 0;i < number.length;i++){
            if(maxValue < number[i]){
                maxValue = number[i];
            }
        }
        System.out.println("最大值为:" + maxValue);
    //2.最小值
        int minValue = number[0];
        for(int i = 0;i < number.length;i++){
            if(minValue > number[i]){
                minValue = number[i];
            }
        }
        System.out.println("最小值为:" + minValue);
    //3.总和
        int sum = 0;
        for(int i = 0;i < number.length;i++) {
            sum += number[i];
        }
        double average = (double) (sum / number.length);
        System.out.println("总和为:" + sum);
        System.out.println("平均值为:" + average);
    }
}*/

//整个都写到一个循环里
public class Random {
    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        //遍历一维数组
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        //求最大值，最小值，总和，平均值。
        int maxValue = number[0];
        int minValue = number[0];
        int sum = 0;
        for(int i = 0;i < number.length;i++){
            sum += number[i];

            if(maxValue < number[i]){
                maxValue = number[i];
            }
            if(minValue > number[i]){
                minValue = number[i];
            }
        }
        int average = sum / number.length;
        System.out.println("最大值为:" + maxValue);
        System.out.println("最小值为:" + minValue);
        System.out.println("总和:" + sum);
        System.out.println("平均值为:" + average);
    }
}