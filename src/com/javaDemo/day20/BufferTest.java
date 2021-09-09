package com.javaDemo.day20;

import org.junit.Test;

import java.io.*;

/*
*   缓冲流
*   1，BufferedInputStream
*   2，BufferedOutputStream
*   3，BufferedReader
*   4，BufferedWriter
* */
public class BufferTest {
        /*
        * 非文本文件的读入与读出
        * */
    @Test
    public void Buffer(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.File类的实例化
            File file = new File("mn.jpg");
            File file1 = new File("mn3.jpg");

            //2.流的实例化
            //2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);

            //2.2造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.读出读入 类似于复制
            byte[] bytes = new byte[1024];
            int len;
            while((len = bufferedInputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流  一般来说有外层的流 只需要关闭外层即可，因为关掉外层，外层自动关闭内层
            if(bufferedOutputStream != null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
