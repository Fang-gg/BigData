/*
* 某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
	首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
	最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
	然后，把加密后的结果在控制台打印出来。
* */

package com.AllDemo;
import java.util.Scanner;
public class Demo726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于八位的整数");
        int x = sc.nextInt();
        int index = 0;
        boolean flag = true;
        while(flag){
            if(x/10!=0){
                x /= 10;
                index ++;
            }else{
                flag = false;
            }
        }
        System.out.println("你输入了"+(index+1)+"位的数据");

        //开辟一个长度为你输入位数的数组
        int [] arr = new int[index+1];

        System.out.println("再次输入一遍你的数字:");
        x = 0;
        x = sc.nextInt();

        //将你输入的数字存入数组
        for(int i=0;i<(index+1);i++){
            if(x == 0){
                break;
            }
            arr[i] = x%10;
            x = x/10;
        }

        System.out.println("**************这是逆序之后的结果***********************");
        //这是逆序之后的数组
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            arr[i] += 5;
            arr[i] %= 10;
        }

        System.out.println("*************这是每位数字都加上5，再用和除以10的余数代替该数字的结果*******************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        int temp = 0;
        temp = arr[index];
        arr[index] = arr[0];
        arr[0] = temp;

        System.out.println("**************这是第一位数字和最后一位数字进行交换***************");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();


    }
}













