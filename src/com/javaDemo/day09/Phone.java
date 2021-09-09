package com.javaDemo.day09;


class Phone1{
    //成员变量
    private String brand;
    private int price;
    private String color;

    //无参数构造
    Phone1(){
    }

    //有参数构造
    Phone1(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //get,set
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void show(){
        System.out.println(this.getBrand() + "---" + this.getPrice() + "---" + this.getColor());
    }

}

public class Phone {
    public static void main(String[] args){
        Phone1 phone1 = new Phone1();
        //set
        phone1.setBrand("华为");
        phone1.setPrice(1999);
        phone1.setColor("black");
        System.out.println(phone1.getBrand() + "----" + phone1.getPrice() + "-----" + phone1.getColor());

        //有参构造
        Phone1 phone11 = new Phone1("华为",1234,"black");
        phone11.show();

    }
}
