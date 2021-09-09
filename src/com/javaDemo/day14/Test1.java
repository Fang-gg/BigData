package com.javaDemo.day14;
/*
*    需求：存储字符串并遍历
* */

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args){
        //1.创建集合对象
        ArrayList arrayList = new ArrayList();
        //2.添加元素
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Hadoop");
        arrayList.add("Spark");
        arrayList.add("BigData");
        //3.迭代器
//        Iterator iterator = arrayList.iterator();
//        //4. while遍历
//        while(iterator.hasNext()){
//            Object next = iterator.next();
//            String next1 = (String) next;
//            System.out.println(next1);
//        }
        //for遍历
        for(int i = 0;i < arrayList.size();i++ ){
            Object o = arrayList.get(i);
            String o1 = (String) o;
            System.out.println(o1);
        }
    }
}
