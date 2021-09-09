package com.javaDemo.day03;
/*
类中属性的使用

属性(成员变量)   VS  局部变量
1.相同点



2.不同点
2.1在类中声明的位置的不同
 属性;直接定义在类的一对{}内
 局部变量:声明在方法内、方法形参、代码块内、构造此形参、构造器内部的变量
2.2关于权限修饰符的不同
属性:可以在声明属性时，指明其权限。使用权限修饰符
常用的权限修饰符有:private、public、缺省、protected   ----->封装性
目前，大家声明属性时，都使用缺省就可以

局部变量:不能使用权限修饰符


方法的声明:权限修饰符 返回值类型 方法名(形参列表){
                          方法体
           }
*/
public class UserTest {
        public static void main(String[] args){
            User u1 = new User();
            System.out.println(u1.name);
            System.out.println(u1.age);
            System.out.println(u1.isMale);
            u1.talk("日语");
        }
}

class User{
    //属性(或成员变量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language:形参，也是局部变量
        System.out.println(language);




    }
}
