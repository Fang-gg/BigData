package com.HSPJava.day02;
/*
*       假如还有59天放假，请问合多少个星期零几天？
*       需求:已知放假天数，求具体多少个星期零几天
*
* */
public class Test1 {
    public static void main(String[] args){
        int days = 59; //定义一个变量来存储天数
        int weeks = days / 7;  //一个礼拜是7天
        int leftDays = days % 7; //余几天

        System.out.println(days + "合" + weeks + "个星期" + leftDays + "天");
    }
}
