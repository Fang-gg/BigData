package com.javaDemo.day25;

import com.javaDemo.day21.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
*
*   编写一个Worker类，为Worker类添加相应的代码，使得Worker对象能正确放入TreeSet中。并编写相应的测试代码。
*
* */
public class Work2 {
    public static void main(String[] args) {
        TreeSet<Worker> list = new TreeSet<Worker>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int i = o1.getAge() - o2.getAge();
                //如果年龄一样，那就比较姓名
                int i1 = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i1;
            }
        });
        //从键盘录入
        Scanner sc = new Scanner(System.in);

        //循环依次输入
        for(int i = 1; i <= 2;i++){
            System.out.println("请输入第" + i + "个人的信息");
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            System.out.println("请输入薪水:");
            int salary = sc.nextInt();
            //创建对象
            Worker worker = new Worker(name, age, salary);
            //把对象添加到集合中
            list.add(worker);
        }
        //遍历集合
        //构造器
        Iterator<Worker> iterator = list.iterator();
        while(iterator.hasNext()){
            Worker next = iterator.next();
            System.out.println(next);
        }
    }
}

class Worker{
    private String name;
    private int age;
    private int salary;

    public Worker() {
    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "-----" + age + "-----" + salary;
    }

}