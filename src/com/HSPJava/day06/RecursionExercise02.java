package com.HSPJava.day06;
/*
*   猴子吃桃子问题:有一堆桃子，猴子第一天吃其中的一半，并再多吃一个！以后每天猴子都吃其中的一半，然后再多吃一个。
*   当到第10天时，想再吃时(即还没开始吃)，发现只有1个桃子。问题:最初一共多少个桃子。
*   分析:
*       第10天   剩1个桃子
*       第9天桃子数  =   (day10 + 1) * 2  = 4;
*       ......以此类推 用递归！！！
*       规律就是 前一天的桃子 = (后一天的桃子 + 1) * 2;
* */
public class RecursionExercise02 {
    public static void main(String[] args){
        Monkey monkey = new Monkey();
        System.out.println(monkey.peach(1));
    }
}

class Monkey{
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day > 0 && day < 10){
            return (peach(day + 1) + 1) * 2;
        }else {
            System.out.println("day在1-10之间");
            return -1;
        }
    }
}
