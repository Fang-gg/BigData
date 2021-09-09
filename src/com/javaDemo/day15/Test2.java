package com.javaDemo.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* */
public class Test2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(32);
        list.add(21);
        list.add(8);
        list.add(35);
        list.add(1);
        //将集合转成数组
        Object[] objects = list.toArray();

        //将数组转成集合
        List<Object> list1 = Arrays.asList(objects);

        for (Object o:list1) {
            Integer o1 = (Integer) o;
            System.out.println(o1);
        }
        System.out.println("-----------");
        //将数组中的元素排序
        Arrays.sort(objects);
        for (Object o:objects) {
            Integer o1 = (Integer) o;
            System.out.println(o1);
        }


    }
}
