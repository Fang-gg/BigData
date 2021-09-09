package com.javaDemo.day15;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

/*
* 数加有两个班级，每个班级5个人，用集合嵌套写出来，并遍历。迭代器遍历或者增强for循环
*
* */
public class Test3 {
    public static void main(String[] args){
        ArrayList<ArrayList<Student>> lists = new ArrayList<ArrayList<Student>>();
        ArrayList<Student> class1 = new ArrayList<Student>();
        Student c1 = new Student("张三1",11);
        Student c2 = new Student("张三2",12);
        Student c3 = new Student("张三3",13);
        Student c4 = new Student("张三4",14);
        Student c5 = new Student("张三5",15);
        class1.add(c1);
        class1.add(c2);
        class1.add(c3);
        class1.add(c4);
        class1.add(c5);
        ArrayList<Student> class2 = new ArrayList<Student>();
        Student s1 = new Student("赵四1", 21);
        Student s2 = new Student("赵四2", 22);
        Student s3 = new Student("赵四3", 23);
        Student s4 = new Student("赵四4", 24);
        Student s5 = new Student("赵四5", 25);
        class2.add(s1);
        class2.add(s2);
        class2.add(s3);
        class2.add(s4);
        class2.add(s5);
        lists.add(class1);
        lists.add(class2);
        for(ArrayList<Student> a:lists ){
            for(Student b : a){
                System.out.println(b);
            }

        }
    }
}
