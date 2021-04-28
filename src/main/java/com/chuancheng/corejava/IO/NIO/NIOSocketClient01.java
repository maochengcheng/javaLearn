package com.chuancheng.corejava.IO.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author maochengcheng
 * @date 2021/4/5 0005
 */
public class NIOSocketClient01 {
    public static void main(String[] args) {
        try {
            SocketChannel socketChannel=SocketChannel.open();
            socketChannel.configureBlocking(false); // 把客户端设置为非阻塞
            socketChannel.connect(new InetSocketAddress("localhost",8080));
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            byteBuffer.put("Hello,I am SocketChannel Client01".getBytes());
            byteBuffer.flip();  // 由读模式转为写
            socketChannel.write(byteBuffer);

            //读取服务端返回的数据
            byteBuffer.clear();
            socketChannel.read(byteBuffer);
            System.out.println("收到服务端的消息："+new String(byteBuffer.array()));

          //  System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
