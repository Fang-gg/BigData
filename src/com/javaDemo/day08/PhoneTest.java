package com.javaDemo.day08;


class Phone{
    //成员变量
    private String brand; //品牌
    private  int price;   //价格
    private String color;    //颜色

    public void setBrand(String a){
        brand = a;
    }
    public String getBrand() {
        return brand;
    }
    public void setPrice(int b){
        price = b;
    }
    public   int getPrice(){
        return price;
    }
    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
}

public class PhoneTest {
     public static void main(String[] args){
         Phone phone = new Phone();
         phone.setBrand("华为");
         phone.setPrice(1999);
         phone.setColor("black");
         System.out.println(phone.getBrand() + "=====" + phone.getPrice() + "=======" + phone.getColor());
     }
}
