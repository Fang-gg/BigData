package com.HSPJava.day09;
/*
*  编写Computer类，包含CPU，内存，硬盘等属性，getDetails方法用于返回Computer的详细信息
*   编写PC类，继承Computer类，添加特有属性品牌[brand]
*   编写NotePad子类，继承Computer类，添加特有属性颜色[color]
*   编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，以及
*   从Computer类继承的属性赋值，并使用方法打印
* */
public class Test {
    public static void main(String[] args) {
        PC pc = new PC(6,1024,1,"华为");
        NotePad notePad = new NotePad(5, 12, 2, "白色");
        pc.printInfo();
        notePad.print();
    }
}

class Computer{
    private int CPU;
    private int Memory;//内存
    private int Caliche;//硬盘

    public Computer() {
    }

    public Computer(int CPU, int memory, int caliche) {
        this.CPU = CPU;
        Memory = memory;
        Caliche = caliche;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getCaliche() {
        return Caliche;
    }

    public void setCaliche(int caliche) {
        Caliche = caliche;
    }

    public String getDetails(){
        return this.getCPU() + "-----" + this.getMemory() + "-----" + this.getCaliche();
    }
}

class PC extends Computer{
    private String brand;//品牌

    public PC(String brand) {
        this.brand = brand;
    }

    public PC(int CPU, int memory, int caliche, String brand) {
        super(CPU, memory, caliche);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getDetails() + " " + this.brand);
    }
}

class NotePad extends Computer{
    private String color;//颜色

    public NotePad(String color) {
        this.color = color;
    }

    public NotePad(int CPU, int memory, int caliche, String color) {
        super(CPU, memory, caliche);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println(getDetails() + " " + this.color);
    }
}