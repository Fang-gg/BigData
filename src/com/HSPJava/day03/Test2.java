package com.HSPJava.day03;
/*
*   某人有100000元，每次经过一次路口，需要交费，规则如下:
*   (1)当现金>50000时，每次交5%
*   (2)当现金<=50000时，每次交1000
*   编程计算该人可以经过多少次路口。
*
* */
public class Test2 {
    public static void main(String[] args){
        double sum = 100000;//定义总资产
       int count = 0;//定义该人能经过几次路口
        while(true){
            if(sum > 50000){
                sum *= 0.95;//过了这个路口之后还剩多少
                count++;
            }else if(sum >= 1000 && sum <= 50000){
                sum -= 1000;
                count++;
            }else if (sum < 1000){//钱不够
                break;
            }
        }
        System.out.println("这人一共经过了" + count + "次路口" + "此时还剩下" + sum + "元");
    }
}
