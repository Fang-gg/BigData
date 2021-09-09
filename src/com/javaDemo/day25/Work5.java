package com.javaDemo.day25;
/*
*   求1+2!+3!+...+20!的和
*   递归
* */
public class Work5 {
    public static void main(String[] args) {
        Sum s = new Sum();
        long sum1 = 0;
        //求和
        for(long i = 1;i <= 20;i++){
            sum1 += s.sum(i);
        }
        System.out.println(sum1);
    }
}

class Sum{
    public long sum(long n){
        if(n == 1){
            return 1;
        }else{
            return n * sum(n - 1);
        }
    }
}
