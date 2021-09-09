package com.javaDemo.day12;
/*
* 1.	编写程序实现比萨制作。需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。可供选择的比萨有：培根比萨和海鲜比萨。
实现思路及关键代码
1)	分析培根比萨和海鲜比萨
2)	定义比萨类
3)	属性：名称、价格、大小
4)	方法：展示
5)	定义培根比萨和海鲜比萨继承自比萨类
6)	定义比萨工厂类，根据输入信息产生具体的比萨对象
*
*   分析:培根披萨和海鲜披萨都是披萨
*       属性:名称，价格，大小
*       方法:展示
* */
import java.util.Scanner;
class Pizza{
    //成员变量
    private String name;//名称
    private int price;//价格
    private int size;//大小
    //无参构造
    public void Pizza(){}
    //有参构造
    public void Pizza(String name,int price,int size){
        this.name = name;
        this.price = price;
        this.size = size;
    }
    //setXxx,getXxx方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}

class PeiPizza extends Pizza{
    private int number;
    public PeiPizza(){}
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void show(){
        System.out.println("培根的克数为:" + getNumber());
    }
}
class HaiPizza extends Pizza{
    private String information;
    public HaiPizza(){}
    public void setInformation(String information){
        this.information = information;
    }
    public String getInformation(){
        return information;
    }
    public void show(){
        System.out.println("配料为:" + getInformation());
    }
}
public class Test1 {
    public static void main(String[] args){
        PeiPizza peiPizza = new PeiPizza();
        HaiPizza haiPizza = new HaiPizza();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择想要制作的比萨(1.培根比萨，2.海鲜比萨)");
        int number1 = scanner.nextInt();
        if(number1 == 1){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("请输入培根个数:");
            int number2 = scanner.nextInt();
            peiPizza.setNumber(number2);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("请输入比萨大小:");
            int number3 = scanner.nextInt();
            peiPizza.setSize(number3);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("请输入比萨价格:");
            int number4 = scanner.nextInt();
            peiPizza.setPrice(number4);
            peiPizza.setName("培根比萨");
            System.out.println("这款披萨叫做:" + peiPizza.getName());
            System.out.println("价格是:" + peiPizza.getPrice());
            System.out.println("大小是:" + peiPizza.getSize());
            System.out.println("培根克数:" + peiPizza.getNumber());
        }
        if(number1 == 2){
            Scanner scanner11 = new Scanner(System.in);
            System.out.println("请输入配料信息:");
            String information = scanner11.next();
            haiPizza.setInformation(information);

            Scanner scanner111 = new Scanner(System.in);
            System.out.println("请输入比萨大小:");
            int number111 = scanner111.nextInt();
            haiPizza.setSize(number111);

            Scanner scanner1111 = new Scanner(System.in);
            System.out.println("请输入比萨价格");
            int number1111 = scanner1111.nextInt();
            haiPizza.setPrice(number1111);
            haiPizza.setName("海鲜比萨");
            System.out.println("这款披萨叫做:" + haiPizza.getName());
            System.out.println("价格是:" + haiPizza.getPrice());
            System.out.println("大小是:" + haiPizza.getSize());
            System.out.println("配料是:" + haiPizza.getInformation());
        }
    }
}

