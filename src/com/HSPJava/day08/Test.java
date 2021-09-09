package com.HSPJava.day08;

/*
 *   创建程序，在其中定义两个类:Account和AccountTest类体会封装
 *   1.Account类要求具有属性:姓名,余额(必须>20),密码(必须是6位)，如果不满足，则给出提示信息，并给默认值
 *
 * */
public class Test {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(30);
        acc.setName("张三");
        acc.setPassword("134567");
        acc.show();
    }

}

class Account {
    private String name;//姓名
    private int balance;//余额
    private String password;//密码

    public Account() {
    }

    public Account(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20！！！");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else{
            System.out.println("密码必须大于6位数！！！");
        }
    }
    public void show(){
        System.out.println("姓名:" + this.getName() + "余额是:" + this.getBalance() + "密码是:" + this.getPassword());
    }
}
