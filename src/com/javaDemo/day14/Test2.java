package com.javaDemo.day14;

import java.util.ArrayList;
import java.util.Iterator;

/*
*         去除集合中字符串的重复值(字符串的内容相同)

        分析：
            1、创建集合对象
            2、添加多个字符串元素到集合中去
            3、创建一个新的集合
            4、遍历旧的集合、获取到每个元素
            5、获取到每个元素，拿着去新的集合去找，看看有没有
                有：跳过
                没有：加到新集合中
            6、遍历新的集合

* */
public class Test2 {
    public static void main(String[] args){
        //1.创建集合对象
        ArrayList arrayList = new ArrayList();
        //2.创建多个字符串元素到集合中去
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("BigData");
        arrayList.add("Hello");
        arrayList.add("Hadoop");
        //3.创建一个新的集合
        ArrayList arrayList1 = new ArrayList();
        //4.遍历旧的集合、获取到每个元素
        //5.获取到每个元素，拿着去新的集合去找，看看有没有
        //   有：跳过
        //   没有：加到新集合中
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            String next1 = (String) next;
            if(!arrayList1.contains(next1)){
                arrayList1.add(next1);
          }
        }
        //6.遍历新数组
//        Iterator iterator1 = arrayList1.iterator();
//            while (iterator1.hasNext()) {
//                Object next = iterator1.next();
//                String next1 = (String) next;
//                System.out.println(next1);
//            }
        //用增强for循环遍历
        for (Object obj : arrayList1) {
            System.out.println(obj);
        }
    }
}



















