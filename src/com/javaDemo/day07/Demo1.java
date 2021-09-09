package com.javaDemo.day07;
/*
        获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写函数得
        到0到n之间的随机数，n是参数。并找出产生50个这样的随机数中最大的、最小的
        数，并统计其中>=60的有多少个。
        提示：使用 int num=(int)(n*Math.random());获取随机数
*/



public class Demo1 {
    public static void main(String[] args){
        int count = 0;
        int[] arr = new int[50];
        for(int i = 0;i < 50;i++) {
            int num = (int) (0 + Math.random() * (100 - 0 + 1));//获取0--100之内的随机数
//            System.out.print(num + "\t");
            arr[i] = num;//随机产生50个随机数，并且把值放进数组里
            count++;
        }
        System.out.println("总数为:" + count);
        //遍历
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //求最大值
        int max = 0;
        for(int i = 0;i < arr.length;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为:" + max);
        //求最小值
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为:" + min);
        //求大于或等于60的个数
        int counts = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >= 60){
                counts++;
            }
        }
        System.out.println("大于或等于60的有" + counts + "个");
    }
}
