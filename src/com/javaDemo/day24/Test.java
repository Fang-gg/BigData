package com.javaDemo.day24;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.locks.ReentrantLock;

/*
        卖票问题
*       锁的第三种方式:Lock锁
*
* */
public class Test {
    public static void main(String[] args){

        L l = new L();
        Thread t1 = new Thread(l,"窗口一");
        Thread t2 = new Thread(l,"窗口二");
        Thread t3 = new Thread(l,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}

class L implements Runnable{
    private static int ticket = 100;
    //创建Lock锁
    private ReentrantLock lock1 = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                //调用lock锁
                lock1.lock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖票，票号是:" + (ticket--));
                }else {
                    break;
                }
            }finally {
                lock1.unlock();
            }
        }
    }
}