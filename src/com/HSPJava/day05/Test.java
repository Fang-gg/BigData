package com.HSPJava.day05;

public class Test {
    public static void main(String[] args){
        AA a = new AA();
        a.odd(12);
    }
}

class AA{
    public boolean odd(int n){
        if(n % 2 == 0){
            System.out.println(n + "是偶数");
            return true;
        }else {
            System.out.println(n + "是奇数");
            return false;
        }
    }
}
