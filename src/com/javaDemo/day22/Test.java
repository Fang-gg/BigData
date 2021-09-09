package com.javaDemo.day22;
/*
*       创建两个分线程，其中一个线程遍历100以内的偶数，另外一个线程遍历100以内的奇数
* */
public class Test {
    public static void main(String[] args){
        //创建Thread子类的对象
        number1 number1 = new number1();
        number2 number2 = new number2();
        //启动线程
        number1.start();
        number2.start();
    }
}

class number1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class number2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}