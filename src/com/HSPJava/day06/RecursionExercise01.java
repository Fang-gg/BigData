package com.HSPJava.day06;
/*
*       使用递归的方式求斐波那契数列。
*       1,1,2,3,5,8,13.....
*
* */
public class RecursionExercise01 {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        int f1 = f.fibonacci(33);
        System.out.println("此时对应值的斐波那契值是:" + f1);
    }
}

class Fibonacci{
    public int fibonacci(int n){
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
    }
}
