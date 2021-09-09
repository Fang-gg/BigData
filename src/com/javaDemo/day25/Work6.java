package com.javaDemo.day25;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class Work6 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("192.168.3.27");
        System.out.println(byName);
        System.out.println(InetAddress.getLocalHost());//获取本机的ip地址
        //getHostName() 获取域名
        //getHostAddress()  获取地址

    }
    //客户端   发送
    @Test
    public void client()  {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1.创建socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("192.168.3.27");
            socket = new Socket(inet, 888);
            //2.获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3.写出数据的操作
            outputStream.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    //服务端   接收
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        InputStream inputStream = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            serverSocket = new ServerSocket(888);
            //2.调用accept()表示接受来自于客户端的socket
            Socket accept = serverSocket.accept();
            //3.获取输入流中的数据，并且读取
            inputStream = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while((len = inputStream.read(bytes) )!= -1){
                String s = new String(bytes, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
