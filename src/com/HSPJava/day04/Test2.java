package com.HSPJava.day04;
/*
*       已知有一个升序的数组，要求插入一个元素，该数组顺序依然是升序。比如:
*       [10,12,45,90],添加23后，数组为[10,12,23,45,90]
*       涉及到了数组的添加以及扩容
*
* */
public class Test2 {
    public static void main(String[] args) {
        //先定义数组以及需要插入的元素
        int[] arr = {10, 12, 45, 90};
        int number = 23;
        int index = -1;//定义一个索引，来记录要插入的位置
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (number <= arr[i]) {//如果插入的数比后一个要小，说明该位置就是要插入的位置，然后进行数组扩容
                index = i;
                break;//找到位置后立马退出
            }
        }
        //判断index的值
        if(index == -1){//说明没有找到位置
            index = arr.length;
        }
        //数组扩容
        int[] arr1 = new int[arr.length + 1];
        //将arr的元素拷贝到arr1 并且要跳过index的位置
        for (int i = 0,j = 0; i < arr1.length; i++) {
            if(i != index){
                arr1[i] = arr[j];
                j++;
            }else {//这里的i就是要插入的位置
                arr1[i] = number;
            }
        }
        arr = arr1;//把扩容之后的数组的地址值赋给arr
        //遍历插入之后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}