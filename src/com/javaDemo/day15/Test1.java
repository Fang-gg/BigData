package com.javaDemo.day15;

import java.util.ArrayList;

/*
*       存储自定义对象，并遍历，要求加入泛型，使用增强for循环遍历
*
* */
public class Test1 {
    public static void main(String[] args){
        //1.创建集合对象
        ArrayList<Student> students = new ArrayList<Student>();
        //2.添加元素
        students.add(new Student("张三",11));
        students.add(new Student("张四",12));
        students.add(new Student("张五",13));
        students.add(new Student("张六",14));
        students.add(new Student("张七",15));
        //3.增强for循环遍历
        for(Student s : students){
            System.out.println(s);
        }
    }
}
