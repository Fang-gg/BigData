package com.javaDemo.day23;
/*          买票问题
*          线程安全
*       一、同步代码块
*       格式:    synchronized(同步监视器){
*                   //需要被同步的代码块
*                }
*          说明:操作共享数据的代码，即为需要被同步的代码
*               共享数据:多个线程共同操作的变量。
*               同步监视器俗称 锁
* */

public class  Test {
    public static void main(String[] args){
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "窗口一");
        Thread t2 = new Thread(ticket, "窗口二");
        Thread t3 = new Thread(ticket, "窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}
class Ticket implements Runnable{
    private static int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖票，票号是:" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}