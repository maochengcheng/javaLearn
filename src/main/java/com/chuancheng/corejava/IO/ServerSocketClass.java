package com.chuancheng.corejava.IO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author maochengcheng
 * @date 2021/3/26 0026
 */
public class ServerSocketClass {
    //启动一个服务端
    public static void main(String[] args) {
        final int DEFAULT_PORT=8080;
        ServerSocket serverSocket=null;

        //绑定一个监听端口
        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);

            //阻塞操作，等待客户端连接
            Socket socket =serverSocket.accept();
            System.out.println("客户端："+socket.getPort()+" 已连接");
            BufferedReader bufferedReader =
           new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientStr =bufferedReader.readLine(); //获得客户端输入的信息
            System.out.println("收到客户端的请求信息："+clientStr);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("我已经收到消息\n");
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
