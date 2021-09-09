package com.javaDemo.day22;
/*
*       创建多线程的方式二:实现Runnable接口
*        1、自定义类实现Runnable接口
*          2、重写run方法
*          3、创建自定义类的对象
*          4、创建Thread类的对象，并把第三步创建的对象当作参数传入构造方法中
*
* */
public class Test2 {
    public static void main(String[] args){
        number n = new number();
        Thread thread = new Thread(n);
        thread.start();
    }

}
class number implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}