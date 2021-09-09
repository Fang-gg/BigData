package com.javaDemo.day05;

import javafx.scene.shape.Circle;

//利用面向对象的编程方法，设计类Circle计算圆的面积
public class Cricle {
    public static void main(String[] args) {
        Circlee c1 = new Circlee();
        c1.radius = 2.1;
        //方式一
//        double area = c1.findArea();
//        System.out.println(area);
        //方式二
        c1.findArea();
    }

}

class Circlee {
    //属性
    double radius;
    //求圆面积的一个方法
    //方式一
//    public double findArea(){
//        double area =Math.PI * radius * radius;
//        return area;
//
//    }

    //方式二
    public void  findArea() {
        double area = Math.PI * radius * radius;
        System.out.println("圆的面积是:" + area);
    }


}
