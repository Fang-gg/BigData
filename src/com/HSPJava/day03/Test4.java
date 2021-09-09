package com.HSPJava.day03;

import org.junit.Test;

/*
*       输出小写的a-z以及大写的Z-A
*       参照ASCII码表发现 小a对应的值是97，A对应的值是65
* */
public class Test4 {
    public static void main(String[] args){
        for(char i = 'a';i <= 'z';i++){
            System.out.print(i);
        }
        System.out.println("");
        for(char j = 'Z';j >= 'A';j--){
            System.out.print(j);
        }
    }


    @Test
    public void number(){
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            for(int j = 1;j <= i;j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
