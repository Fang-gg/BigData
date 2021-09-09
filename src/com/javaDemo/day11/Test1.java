package com.javaDemo.day11;
/*
*                       猫狗案例
                        具体事物：猫，狗
                        共性：姓名，年龄，吃饭
            都是动物 animal
                      分析:猫                              狗
                      成员变量:姓名 年龄                      成员变量:姓名 年龄
                      成员方法:吃饭                           成员方法:吃饭
* */
abstract class Animal{
    //成员变量
    private String name;
    private int age;
    //无参构造
    public Animal(){}
    //有参构造
    public Animal(String name,int age){
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
    public abstract void eat();
}

class Cat extends Animal{
    public Cat(){}
    public Cat(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
class Dog extends Animal{
    public Dog(){}
    public Dog(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃肉");
    }
}

public class Test1{
    public static void main(String[] args){
        //无参构造调用
        Cat cat = new Cat();
        cat.setName("小花");
        cat.setAge(12);
        System.out.println(cat.getName() + "-----" + cat.getAge());
        cat.eat();
        //有参构造调用
        Cat cat1 = new Cat("小白",12);
        System.out.println(cat1.getName() + "-----" + cat1.getAge());
        cat1.eat();
        //多态调用
        Animal animal = new Cat();
        animal.setAge(11);
        animal.setName("小黄");
        System.out.println(animal.getAge() + "-----" + animal.getName());
        animal.eat();
        //无参构造调用
        Dog dog = new Dog();
        dog.setName("狗狗1号");
        dog.setAge(1);
        System.out.println(dog.getName() + "----" + dog.getAge());
        dog.eat();
        //有参构造调用
        Dog dog1 = new Dog("狗狗2号",2);
        System.out.println(dog1.getName() + "-----" + dog1.getAge());
        dog1.eat();
        //多态调用
        Animal animal1 = new Dog();
        animal1.setName("狗狗3号");
        animal1.setAge(3);
        System.out.println(animal1.getAge() + "-----" + animal1.getName());
        animal1.eat();







    }
}


















