package com.javaDemo.day18;

import org.junit.Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //1.实例化File类的对象，指明要操作的文件
        File file = new File("D:\\文件文档\\mysql新旧密码.txt");
        //2.提供具体的流
        try {
            FileReader fileReader = new FileReader(file);
            //3.读入数据
            int read = fileReader.read();
            while(read != -1){
                System.out.print((char) read);
                read = fileReader.read();
            }
            //4.关闭流
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test()  {
        FileReader fileReader = null;
        try {
            //1.File类的实例化
            File file = new File("D:\\文件文档\\mysql新旧密码.txt");

            //2.流的实例化
            fileReader = new FileReader(file);

            //3.读取数据
            char[] cf = new char[5];
            int len;
            while((len = fileReader.read(cf)) != -1){
             for(int i = 0; i < len; i ++){
                 System.out.print(cf[i]);
             }
          }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭流
            if(fileReader != null){
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
      }

  }
    @Test
    public void write(){
        //1.File类的实例化
        File file1 = new File("s.txt");
        //2.提供File对象，用于数组的输出
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file1,false);
            //3.写出的操作
            fileWriter.write("hcexfgijkamdnoqrzstuvwybpl");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流的关闭
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void testFileReadFileWriter(){
        //1.实例化File类
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");
            File file1 = new File("hello1.txt");
            //2.流处理，输入流和输出流
            fileWriter = new FileWriter(file1);
            fileReader = new FileReader(file);
            //3.数据的读写操作
            char[] chars = new char[5];
            int len;
            while((len = fileReader.read(chars)) != -1){
                fileWriter.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void Rw(){
        FileReader fileReader = null;//读入数据
        FileWriter fileWriter = null;//输出数据
        try {
            //1.File类的实例化
            File file = new File("hello.txt");
            File file1 = new File("hello2.txt");

            //2.实例化流
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);

            //3.将数据读入并且读出，相当于赋值操作
            char[] chars = new char[5];
            int len;
            while((len = fileReader.read(chars) )!= -1){
                fileWriter.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            try {
                if(fileWriter != null)
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fileReader != null)
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void FileInputOutputStreamTest(){
        FileInputStream fileInputStream = null;
        try {
            //1.实例化File类
            File file = new File("hello.txt");

            //2.实例化流
            fileInputStream = new FileInputStream(file);

            //3.读入数据
            byte[] bytes = new byte[5];
            int len;
            while((len = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null)
                //4.流的关闭
            {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test//对图片mn.jpg的复制操作
    public void FileInputOutputStreamTest1(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.File类的实例化
            File file = new File("mn.jpg");
            File file1 = new File("mn1.jpg");

            //2.流的实例化
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);

            //3.读入和读出
            byte[] bytes = new byte[5];
            int len;
            while((len = fileInputStream.read(bytes)) != -1){
                    fileOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //把复制操作封装起来
    public void copyFile(String firstPath,String endPath){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.File类的实例化
            File file = new File(firstPath);
            File file1 = new File(endPath);

            //2.流的实例化
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);

            //3.读入和读出
            byte[] bytes = new byte[1024];
            int len;
            while((len = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile(){
        copyFile("mn.jpg","mn2.jpg");
    }

}


