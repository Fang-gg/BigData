package com.AllDemo;


public class Demo723 {
    public static void main(String[] args){
        for(int i = 1;i <= 10;i++){//请在控制台输出数据1-10
            System.out.print(i + "\t");
        }
        System.out.println();
        for(int j = 10;j >= 1;j--){ //请在控制台输出数据10-1
            System.out.print(j + "\t");
        }

        int sum = 0;
        for(int i = 1;i <= 10;i++){//求出1-10之间数据之和
            sum += i;
        }
        System.out.println(sum);
        int sum1 = 0;
        for(int i = 1;i <= 100;i++){ //求出1-100之间偶数和
            if(i % 2 == 0){
                sum1 += i;
            }
        }
        System.out.println("1-100之间的偶数和为:" + sum1);
        int sum2 = 0;
        for(int i = 1;i <= 100;i++){//求出1-100之间奇数和
            if(i % 2 != 0){
                sum2 += i;
            }
        }
        System.out.println("1-100之间的奇数和为:" + sum2);
        int x = 1;
        for(int i = 1;i <=5;i++){//求5的阶乘
            x = x*i;
        }
        System.out.println("5的阶乘为:" + x);
        int y,z,j;
        int count = 0;//统计个数
        /**
         * y表示个位，z表示十位，j表示百位
         * */
        for(int i = 100;i < 1000;i++){//在控制台输出所有的”水仙花数”
            y = i % 10;
            z = i / 10 % 10;
            j = i / 10 /10 % 10;
            if(y*y*y + z*z*z + j*j*j == i){
                count++;
                System.out.println("水仙花数为:" + i);
            }
        }
        System.out.println("水仙花个数为:" + count);
    }
}
