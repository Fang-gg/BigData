package com.javaDemo.day03;
/*
一、Java面向对象学习的三条主线
1.Java类及类的成员:属性、方法、构造器;代码块、内部类
2.面向对象的三大特征:封装性、继承性、多态性
3.其他关键字:this、super、static、final、abstract、interface、package、import等

面向对象的两个要素
面向对象程序设计的重点就是类的设计
设计类就是设计类的成员

属性 = 成员变量 = field = 域、字段
方法 = 成员方法 = 函数 = method

创建类的对象 = 类的实例化 = 实例化类

如果创建了一个类的多个对象，那么每个对象都有一套独立的类的属性(非static的)
意味着:如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值。
*/


import java.util.Scanner;

public class OOPTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
//        Scanner scanner = new Scanner(System.in)

        //调用对象的结构:属性和方法
        //调用属性的格式:"对象.属性"
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        System.out.println(p1.isMale);

        //调用方法的格式:"对象.方法"
        p1.eat();
        p1.sleep();


    }
}

//创建类以及设计类的思想
    class Person{
        //属性
        String name;
        int age = 1;
        boolean isMale;

        //方法
        public void eat(){
            System.out.println("人可以吃饭");
        }
        public void sleep(){
            System.out.println("人可以睡觉");
        }
}
