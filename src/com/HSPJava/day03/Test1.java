package com.HSPJava.day03;

import java.util.Scanner;

/*
*   实现登陆验证，有3次机会，如果用户名为"方世涛"，密码为"666"则提示登陆成功，否则提示还有几次机会
*
* */
public class Test1 {
    public static void main(String[] args){
        //从键盘输入
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i <= 3;i++){//3次机会
            System.out.println("第" + i + "次机会");
            System.out.println("请输入用户名:");
            String name = scanner.next();
            System.out.println("请输入密码:");
            String password = scanner.next();
            if("方世涛".equals(name) && "666".equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("登陆失败，你还有" + (3-i) + "次机会");
            }
        }
    }
}
