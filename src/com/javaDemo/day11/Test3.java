package com.javaDemo.day11;
/*          接口练习
*           猫狗案例,加入跳高的额外功能
* */
//定义一个跳高接口
interface Jump{
    public abstract void jump();
}
abstract class Animal3{
    private String name;
    private int age;
   public Animal3(){}
   public Animal3(String name,int age){
       this.name = name;
       this.age = age;
   }
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
}
class Cat3 extends Animal3{
    public Cat3(){}
    public Cat3(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
class Dog3 extends Animal3{
    public Dog3(){}
    public Dog3(String name,int age){
        super(name,age);
    }
}
class JumpCat extends Cat3 implements Jump{
    public JumpCat(){}
    public JumpCat(String name,int age){
        super(name, age);
    }
    public void jump(){
        System.out.println("猫会跳高");
    }
}
class JumpDog extends Dog3 implements Jump{
    public JumpDog(){}
    public JumpDog(String name,int age){
        super(name, age);
    }
    public void jump(){
        System.out.println("狗会钻火圈");
    }
}

public class Test3 {
        public static void main(String[] args){
            JumpCat jumpCat = new JumpCat();
            jumpCat.setAge(12);
            jumpCat.setName("小紫");
            jumpCat.jump();
            System.out.println(jumpCat.getAge() + "-----" + jumpCat.getName());

        }

}
