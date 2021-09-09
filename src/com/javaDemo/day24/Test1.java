package com.javaDemo.day24;

import javax.swing.*;
import java.util.concurrent.locks.ReentrantLock;

/*
*       练习
*    银行有一个账户，有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
*
* */
public class Test1 {
    public static void main(String[] args){
        Account account = new Account(0);
        Person p = new Person(account);
        Thread t1 = new Thread(p, "储户1");
        Thread t2 = new Thread(p, "储户2");
        t1.start();
        t2.start();
    }
}

class Account{
        private double balance; //账户余额

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱方法
    public synchronized void deposit(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功。当前余额为:" + balance);
        }
    }

    //取钱方法
    public synchronized void get(double atm){
        if(balance > 0){
            balance -= atm;
            System.out.println(Thread.currentThread().getName() + "取钱成功，当前余额为:" + balance);
        }
    }
}

class Person implements Runnable{
    private Account account;

    public Person(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
            account.get(500);
        }
    }
}

