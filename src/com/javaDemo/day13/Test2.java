package com.javaDemo.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args){
        //1.创建集合对象
        Collection c = new ArrayList();
        //2.添加字符串进集合
        c.add("Hello");
        c.add("World");
        c.add("Spark");
        c.add("Hadoop");
        //3.迭代器
        Iterator iterator = c.iterator();
        //4.遍历
        while(iterator.hasNext()){
            Object next = iterator.next();
            String next1 = (String) next;
            System.out.println(next1);
        }
    }
}
