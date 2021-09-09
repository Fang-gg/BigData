package com.javaDemo.day12;
//多线程的创建
//方式一:继承于Thread类
//1.创建一个继承于Thread类的子类
//2.重写Thread类中的run() -------->将此线程执行的操作声明到run()中
//3.创建Thread类的子类的对象
//4.通过此对象调用start()

class number11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class  Test11{
        public static void main(String[] args){
            number11 number11 = new number11();
            number11.start();
//            number11.run();//直接调用run就不能叫做多线程了
        }
}