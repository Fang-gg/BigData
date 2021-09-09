package com.HSPJava.day10;
/*
* */
public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Worker w = new Worker("张三", 5000);
        test1.showEmpAnnual(w);

        test1.showEmpAnnual(new Manager("李四",5000,10000));
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

}

class Employee{
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnual(){
        return 12 * salary;
    }
}

class Worker extends Employee{
    public Worker() {
    }

    public Worker(String name, int salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("上班");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual();
    }
}

class Manager extends Employee{
    private int bonus;

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manager(){
        System.out.println("我是管理者");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual() + this.bonus;
    }

}