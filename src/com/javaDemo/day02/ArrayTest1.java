package com.javaDemo.day02;
/*
使用简单数组
1.创建一个名为ArrayTest1的类,在main()方法中声明array1和array2两个变量，他们是int[]类型的数组
2.使用大括号{},把array1初始化为8个素数:2,3,5,7,11,13,17,19
3.显示array1的内容
4.赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值。
如array[0]=0,array[2]=2,打印出array1。
*/
public class ArrayTest1 {
    public static void main(String[] args){
        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2;
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");//显示array1的内容
        }
        System.out.println();


     /*   //赋值array2变量等于array1
        //不能称作数组的复制
        array2 = array1;//这个只是把array1的地址值给到了array2
        for(int i = 0;i < array2.length;i++){
            System.out.print(array2[i] + "\t");

        }
        System.out.println();

        for(int i = 0;i < array2.length;i++){
            if(i % 2 == 0){
                array2[i] = i;
            }
        }

        for(int i = 0;i < array2.length;i++){
            System.out.print(array2[i] + "\t");

        }
        */

        //若想要对数组实现复制操作 如下所示
        array2 = new int[array1.length];
        for(int i = 0;i < array2.length;i++){
            array2[i] = array1[i];
            System.out.print(array2[i] + "\t");
        }

       System.out.println();

    }
}
