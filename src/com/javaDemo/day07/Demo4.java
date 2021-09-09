package com.javaDemo.day07;
/*
* 4.    合并数组操作：现有如下一个数组:int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
*       要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，
*       生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}
        思路： 确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，取出内容，并将其赋给新开辟的数组。
*
* */
public class Demo4 {
    public static void main(String[] args){
        int[] oldArr = new int[]{1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = 0;
        //计算新数组的长度，只要旧数组不为0，count就自增。
        for(int i = 0;i < oldArr.length;i++){
            if(oldArr[i] != 0){
                count++;
            }
        }
        //定义一个新数组，用count来控制数组长度
        int[] newArr = new int[count];
        int a = 0;
        for(int i = 0;i < oldArr.length;i++){
            if(oldArr[i] != 0){
                newArr[a] = oldArr[i];
                a++;
            }
        }
        for(int i = 0;i < newArr.length;i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}
