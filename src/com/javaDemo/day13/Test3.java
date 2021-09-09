package com.javaDemo.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
*  List
*      现在我有一个集合，请问我想判断里面有没有"world"这个元素，如果有，我们就添加一个
                "Love",怎么办呢？
* */
public class Test3 {
    public static void main(String[] args){
        //1.创建集合对象
        List l1 = new ArrayList();
        //2.添加元素
        l1.add("Hello");
        l1.add("World");
        l1.add("BigData");
        l1.add("Spark");
        l1.add("Hadoop");
        //3.迭代器遍历元素，迭代器修改元素。
        ListIterator i = l1.listIterator();
        while(i.hasNext()){
            Object next = i.next();
            String next1 = (String) next;
            if("World".equals(next1)){
                i.add("Love");
            }
        }
        //4.遍历
        Iterator iterator = l1.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            String next1 = (String) next;
            System.out.println(next1);
        }
    }
}
