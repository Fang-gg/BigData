package com.AllDemo;

import java.util.Scanner;

public class Demo724 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数:");
//        int x = sc.nextInt();
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("请输入第二个数:");
//        int y = sc1.nextInt();
//        int max1 = max(x,y);
//        System.out.println("最大的数字是:" + max1);
//    }
//        public static void max(int a,int b){
//           int max = (a > b)?a:b;
//            return max;
//        }
//        short x = 1;
//        short y = 2;
//        boolean z = orEquals(x,y);
//        System.out.println(z);
//    }
//        public static boolean orEquals(short a,short b){
//            return a == b;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入(0-9)之间的数:");
//        int x = sc.nextInt();
//        testJiuJiu(x);
//    }
//
//    public static void testJiuJiu(int a) {
//        for(int i = 1; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }
        double money = 2.5;
        int day = 1;
        while(money < 100){
            money = money + 2.5;
            day ++;
            if(day % 5 == 0){
                money = money - 6;
            }
        }
        System.out.println(day);
//        System.out.println(day);
//        int sum = 100;// 最终的目标
//        double db = 2.5;// 每次存放的钱数
//        int day = 1;// 天数
//        double dsum = 0;// 每次存放的总数
//        while (true) {
//            dsum = dsum + db;// 返回每天都存放钱的总和
//            if (day % 5 == 0) {// 判断是不是5的倍数
//                dsum = dsum - 6;// 从总数中扣去6元
//                System.out.println("第" + day + "天花去6元，还剩" + dsum + "元！");
//            }
//            boolean flag = dsum >= sum;// 求dsum是否大于sum的boolean值
//            if (flag) {	// 如果是true则输出最终的结果，并跳出循环
//                System.out.println("要经过连续存储" + day + "天，才能存上100元！");
//                break;
//            } else {// 否则天数加1，也就是继续存钱
//                day++;
//            }
//        }
    }
}

