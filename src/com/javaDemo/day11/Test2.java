package com.javaDemo.day11;
/*
*               老师案例
                具体事物：基础班老师，就业班老师
                共性：姓名，年龄，讲课。
*
* */

abstract class Person{
    //成员变量
    private String name;
    private int age;
    //无参构造
    public Person(){}
    //有参构造
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //setXxx,getXxx方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //方法
    public abstract void teach();
}
class JavaTeacher extends Person{
    //无参构造
    public JavaTeacher(){}
    //有参构造
    public JavaTeacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("教Java");
    }
}
class BigDataTeacher extends Person{
    //无参构造
    public BigDataTeacher(){}
    //有参构造
    public BigDataTeacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("教大数据");
    }
}
//测试
public class Test2{
    public static void main(String[] args) {
        //无参调用
        JavaTeacher javaTeacher = new JavaTeacher();
        javaTeacher.setName("小白");
        javaTeacher.setAge(22);
        javaTeacher.teach();
        System.out.println(javaTeacher.getName() + "------" + javaTeacher.getAge());
        //有参构造
        JavaTeacher javaTeacher1 = new JavaTeacher("小黑",23);
        javaTeacher1.teach();
        System.out.println(javaTeacher.getName() + "------" + javaTeacher.getAge());
        //多态调用
        Person person = new JavaTeacher();
        person.setAge(24);
        person.setName("小绿");
        person.teach();
        System.out.println(javaTeacher.getName() + "------" + javaTeacher.getAge());





    }

}


































