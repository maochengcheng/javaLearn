package com.chuancheng.corejava.IO.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author maochengcheng
 * @date 2021/4/5 0005
 */
public class NIOSocketServer01 {
    public static void main(String[] args) {
        try {
            //可以支持两种模式，阻塞，非阻塞
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            //修改步骤
            serverSocketChannel.configureBlocking(false); // 默认true,阻塞
            //修改步骤
            serverSocketChannel.socket().bind(new InetSocketAddress(8080));
            while(true){
                SocketChannel socketChannel = serverSocketChannel.accept();
                if(socketChannel !=null){
                    //如果代码进入这个位置，说明有连接过来
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    socketChannel.read(buffer);
                    System.out.println(new String(buffer.array()));
                    //再把消息写回到客户端
                    Thread.sleep(10000);
                    buffer.flip();
                    socketChannel.write(buffer);
                }else{
                    Thread.sleep(1000);
                    System.out.println("没有客户端连接进来");
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
