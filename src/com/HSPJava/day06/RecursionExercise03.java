package com.HSPJava.day06;
/*
*       递归:小球出迷宫问题
*
* */
public class RecursionExercise03 {
    public static void main(String[] args){
        //创建一个迷宫,可以用二维数组表示。1代表墙,0表示可以走的路
        int[][] miGong = new int[8][7];
        //打印看看效果
        for (int i = 0; i < miGong.length; i++) {
            for (int j = 0; j < miGong[i].length; j++) {
                miGong[0][j] = 1;
                miGong[i][0] = 1;
                miGong[i][miGong[i].length - 1] = 1;
                miGong[7][j] = 1;
                miGong[3][1] = miGong[3][2] = 1;
                System.out.print(miGong[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        //开始操作
        miGong[1][1] = 0;//规定小球的出发位置
        Mi mi = new Mi();
        boolean find = mi.findway(miGong, 1, 1);
        System.out.println(find);
        for (int i = 0; i < miGong.length; i++) {
            for (int j = 0; j < miGong[i].length; j++) {
                miGong[0][j] = 1;
                miGong[i][0] = 1;
                miGong[i][miGong[i].length - 1] = 1;
                miGong[7][j] = 1;
                miGong[3][1] = miGong[3][2] = 1;
                System.out.print(miGong[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

class Mi{
    //1.定义二维数组数字含义  0表示可以走  1表示障碍物  2表示可以走  3表示走过但是发现是思路
    //2.制定规则: 当 miGong[6][5] = 2的时候就表示小球走出了迷宫
    //3.规定小球走的时候的策略  即从 下----->右------>上------->左   只要找路策略更改了，其走的路线也会不一样
    public boolean findway(int[][] map,int i,int j){
        if(map[6][5] == 2){//表示如果地图上面的[6][5]位置等于2，那就说明小球出了迷宫
            return true;
        }else{
            if(map[i][j] == 0){//表示可以走
                //此时假定小球可以继续走
                map[i][j] = 2;
                //开始使用找路策略:下----->右------>上------->左
                if(findway(map,i+1,j)){
                    return true;
                }else if(findway(map,i,j+1)){
                    return true;
                }else if(findway(map,i-1,j)){
                    return true;
                }else if(findway(map,i,j-1)){
                    return true;
                }else {
                    return false;
                }
            }else{//此时无外乎3种情况,1,2,3;
                return false;
            }
        }
    }
}
