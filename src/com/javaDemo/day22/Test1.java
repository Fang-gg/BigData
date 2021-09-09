package com.javaDemo.day22;
/*
*       窗口卖票问题 一共100张票
*
* */
public class Test1 {
    public static void main(String[] args){
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Ticket extends Thread{
    private static int ticket = 100;
    private static int sum = 0;
    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println("当前" + Thread.currentThread().getName() + "卖票，票号为" + (ticket--));
            }else {
                break;
            }
        }
    }
}



