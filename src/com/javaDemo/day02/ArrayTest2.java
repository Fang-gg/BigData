package com.javaDemo.day02;
/*
算法的考查:数组的复制，反转，查找(线性查找，二分法查找)

*/
public class ArrayTest2 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,20,10,34,43};
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        //数组的复制 要区别于数组的赋值(arr2 = arr1,详情见ArrayTest1)
        int[] array1 = new int[array.length];
        for(int i = 0;i < array1.length;i++){
            array1[i] = array[i];
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
//
//        //数组的反转
//        for(int i = 0;i < array.length / 2;i++){
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//
//        }
        //遍历
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + "\t");

        }
            System.out.println();

        //数组的查找(线性查找和二分法查找)
        //1.线性查找
        int dest = 5;
        boolean isFlag = true;
        for(int i = 0;i < array.length;i++){
            if(dest == array[i]){
                System.out.println("找到了指定的元素，位置为:" + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.println("很遗憾，没有找到");
        }

        //二分法查找
        //前提:所要查找的数组必须有序
        int dest1 = 2;
        int start = 0;//初始的首索引
        int end = array.length - 1;//初始的末索引
        boolean flag = true;
        while(start <= end){
            int middle = (start + end) / 2;
            if(dest1 == array[middle]){
                System.out.println("找到了指定的元素，位置为:" + middle);
                flag = false;
                break;
            }else if(dest1 < array[middle]){
                end = middle - 1;
            }else{//dest1 > array[middle]
                start = middle + 1;
            }
        }
        if(flag){
            System.out.println("很遗憾，没有找到");
        }














    }
}
