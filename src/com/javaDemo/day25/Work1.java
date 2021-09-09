package com.javaDemo.day25;
/*
*   2.	设计一个多线程的程序如下：设计一个火车售票模拟程序。假如火车站要有100张火车票要卖出
*       现在有5个售票点同时售票，用5个线程模拟这5个售票点的售票情况。
*
*
* */
public class Work1 {
    public static void main(String[] args) {
        //new对象
        HuoChe huoChe = new HuoChe();
        //Thread引用
        Thread t1 = new Thread(huoChe, "窗口1");
        Thread t2 = new Thread(huoChe, "窗口2");
        Thread t3 = new Thread(huoChe, "窗口3");
        Thread t4 = new Thread(huoChe, "窗口4");
        Thread t5 = new Thread(huoChe, "窗口5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
//实现Runnable接口
class HuoChe implements Runnable{
    //把100张票放到静态区
    private static int ticket = 100;
    //先new一个，可以当作锁
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖票，票号是:" + (ticket--));
                }else {
                    break;
                }
            }
        }
    }
}
