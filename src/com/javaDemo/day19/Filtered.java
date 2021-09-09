package com.javaDemo.day19;

import java.io.File;
import java.io.FileInputStream;

public class Filtered {
    static StringBuffer strs = new StringBuffer();
    static int i = 0;
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\bigdata12");
        readFile(file);
        count();
        System.out.println(i);
    }
    public static void readFile(File file) throws Exception {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    FileInputStream fis = new FileInputStream(f.getAbsolutePath());
                    byte[] bytes = new byte[1024];
                    int j;
                    while ((j = fis.read(bytes)) != -1) {
                        strs.append(new String(bytes, 0, j));
                    }
                    fis.close();
                }
            } else {
                readFile(f);
            }
        }
    }

    public static void count() {
        String[] split = strs.toString().split("\r\n");
        for (String s:split) {
            i++;
        }
    }
}



