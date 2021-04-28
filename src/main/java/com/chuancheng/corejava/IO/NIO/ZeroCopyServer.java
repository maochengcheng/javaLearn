package com.chuancheng.corejava.IO.NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author maochengcheng
 * @date 2021/4/6 0006
 */
public class ZeroCopyServer {
    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(8080));
            SocketChannel socketChannel = serverSocketChannel.accept(); //阻塞获得客户连接
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int r = 0;
            FileChannel fileChannel = new FileOutputStream("E:/test_cp.txt").getChannel();
            while(r!=-1){
                r=socketChannel.read(byteBuffer);
                //todo
                byteBuffer.flip();
                fileChannel.write(byteBuffer);
                byteBuffer.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
        }

    }
}
