package com.javaDemo.day25;
/*
*   数组[8,5,6,1,2,3,4,7],使用冒泡循环和选择排序完成从小到大进行排序
* */
public class Work3 {
    public static void main(String[] args) {
        int[] arr = {8,5,6,1,2,3,4,7};
        MaoPao maoPao = new MaoPao();
        maoPao.mao(arr);

        XZ xz = new XZ();
        xz.selectSort(arr);
    }
}

//冒泡排序
class MaoPao{
    public void mao(int[] arr){
        int temp;
        //冒泡排序
       for(int i = 0;i < arr.length - 1;i++){
           for(int j = 0;j < arr.length - 1 - i;j++){
               if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       //输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

//选择排序
class XZ{
    public void selectSort(int[] arr){
        int temp;
        for(int i = 0;i < arr.length - 1;i++){
            int index = i;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
                if(index != i){
                    temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
        }
        //输出排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
