package com.javaDemo.day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
* 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
*
* */
public class Test2 {
    public static void main(String[] args){
        //创建集合对象，这里用到Treeset集合
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getScore() - o1.getScore();
                //总分一样，语文成绩不一样
                 int i1 = i == 0 ? o2.getChinese() - o1.getChinese() : i;
                //语文成绩一样，数学成绩不一样
                int i2 = i1 == 0 ? o2.getMath() - o1.getMath() : i1;
                //数学成绩一样，英语成绩不一样
                int i3 = i2 == 0 ? o2.getEnglish() - o1.getEnglish() : i2;
                //成绩一样，名字不一样
                int i4 = i3 == 0 ? o2.getName().compareTo(o1.getName()) : i3;
                return i4;
            }
        });
        //从键盘录入
        Scanner sc = new Scanner(System.in);

        //循环依次输入
        for(int i = 1; i <= 5;i++){
            System.out.println("请输入第" + i + "个学生的信息");
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生语文成绩:");
            int chinese = sc.nextInt();
            System.out.println("请输入学生数学成绩:");
            int math = sc.nextInt();
            System.out.println("请输入学生英语成绩:");
            int english = sc.nextInt();

            //创建学生对象
            Student s = new Student(name,chinese,math,english);
            //把学生对象添加到集合中
            ts.add(s);
        }

        //遍历集合并且写入文件中
        BufferedWriter bufferedWriter = null;
        try {
            //造一个输出缓存流
            bufferedWriter = new BufferedWriter(new FileWriter("studentinfo.txt"));
            bufferedWriter.write("信息如下:");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.write("姓名\t\t语文成绩\t\t数学成绩\t\t英语成绩\t\t总分为\t\t");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            //遍历集合
            for(Student s : ts){
                bufferedWriter.write(s.getName() + s.getChinese() + s.getMath() + s.getEnglish() + s.getScore());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedWriter != null){
                //关闭流
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("学生信息录入完毕！");
    }

}
