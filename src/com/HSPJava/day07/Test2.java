package com.HSPJava.day07;

/*
 *       编写类Book,定义方法updatePrice,实现更改某本书的价格，具体:如果价格>150，则更改为150,
 *       如果价格>100，则更改为100,否则不变.
 *
 * */
public class Test2 {
    public static void main(String[] args) {
        Book book = new Book("三国", 399);
        book.updatePrice();
        book.show();
    }
}


class Book {
    String name;
    int price;

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    public void show() {
        System.out.println(this.name + "------" + this.price);
    }
}
