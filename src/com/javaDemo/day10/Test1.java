package com.javaDemo.day10;

/*
* 1.	使用面向对象的思想，编写自定义描述狗的信息。设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
要求：
1)	设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
2)	限定心情只能有“心情好”和“心情不好”两种情况，如果无效输入进行提示，默认设置“心情好”。
3)	设置构造函数实现对属性赋值
4)	叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
5)	编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）

* */
class Dog{
    //属性
    private String kind;
    private int age;
    private String emotion="心情好";//心情
    private String name;
    //构造方法
    public Dog(){
    }
    public Dog(String kind,int age,String emotion,String name){
        this.kind=kind;
        this.age=age;
        this.emotion=emotion;
        this.name=name;
    }
    //方法
    //set和get方法
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmotion() {
        return emotion;
    }
    public void setEmotion(String emotion) {
        if(emotion.equals("心情好") && emotion.equals("心情不好")){
            this.emotion = emotion;
        }else{
            System.out.println("输入无效！！！");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //方法
    public void bark(){
        if(this.emotion.equals("心情好")){
            System.out.println("名字叫"+name+"的"+kind+"心情很好，开心的汪汪叫");
        }else{
            System.out.println("名字叫"+name+"的"+kind+"心情不好，伤心的呜呜叫");
        }
    }
    public void run(){
        if(this.emotion.equals("心情好")){
            System.out.println("名字叫"+name+"的"+kind+"心情很好，开心的围着主人身边转");
        }else{
            System.out.println("名字叫"+name+"的"+kind+"心情不好，伤心的一动不动");
        }
    }
}
public class Test1{
    public static void main(String[] args) {
        Dog dog = new Dog("贵宾犬", 6, "心情好", "甜心");
        dog.run();
        dog.bark();

        dog.setEmotion("垂头丧气");
        dog.getEmotion();

        Dog dog1 = new Dog("德国牧羊犬", 8, "心情不好", "太子");
        dog1.run();
        dog1.bark();
    }
}








