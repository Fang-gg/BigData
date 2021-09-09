package com.javaDemo.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1{
    public static void main(String[] args){
        //1.对象的集合创建
        Collection c = new ArrayList();
        //2.添加元素进集合
        c.add(new Student1("张三",11));
        c.add(new Student1("张四",12));
        c.add(new Student1("张五",13));
        //3.将集合转化为迭代器
        Iterator iterator = c.iterator();
        //4.循环
        while (iterator.hasNext()){
            Object next = iterator.next();
            Student1 next1 = (Student1) next;
            System.out.println(next1.getName() + "------" + next1.getAge());
        }
    }
}


class Student1{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1() {
    }
}