package com.javaDemo.day17;

import java.io.File;
import java.io.IOException;

/*
*
* */
public class Test3 {
    public static void main(String[] args) {
        File file = new File("D:\\兰智数加\\上课视频\\第二十天");
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                if(f.getName().endsWith(".jpg")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
