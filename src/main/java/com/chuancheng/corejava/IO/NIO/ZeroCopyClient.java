package com.chuancheng.corejava.IO.NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author maochengcheng
 * @date 2021/4/6 0006
 */
public class ZeroCopyClient {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost",8080));
            FileChannel fileChannel = new FileInputStream("E:/test.txt").getChannel();
            //tf 标书总的字节数
            int position = 0;
            long size = fileChannel.size();
            while(size>0){
                long tf = fileChannel.transferTo(position,size,socketChannel);
                System.out.println("传输数据字节数："+tf);
                if(tf>0){
                    position+=tf;
                    size-=tf;
                }
            }


            socketChannel.close();
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
