package com.AllDemo;
/*
* 创建三个窗口买票，总票数为100张，使用实现Runnable接口的方式
* */

class number11 implements Runnable{
    public static int ticket = 1000;
    Object object = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(object)  {
            if(ticket > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                ticket--;
                }else {
                break;
                }
            }
        }
    }
}
public class Demo8082 {
    public static void main(String[] args){
        number11 number11 = new number11();
        Thread thread1 = new Thread(number11);
        Thread thread11 = new Thread(number11);
        Thread thread111 = new Thread(number11);
        thread1.setName("窗口1");
        thread11.setName("窗口2");
        thread111.setName("窗口3");
        thread1.start();
        thread11.start();
        thread111.start();


    }
}
