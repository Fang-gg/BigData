package com.HSPJava.day07;
/*
*   定义方法max,实现求某个double数组的最大值，并返回
*
* */
public class Test1 {
    public static void main(String[] args){
        Max max = new Max();
        double number = max.number(19, 11, 33, 44, 22);
        System.out.println(number);
    }
}

class Max{
    public double number(double... n){
        double max;
        max = n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i] >= max){
                max = n[i];
            }
        }
        return max;
    }
}
