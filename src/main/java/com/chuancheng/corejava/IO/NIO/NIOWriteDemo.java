package com.chuancheng.corejava.IO.NIO;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class NIOWriteDemo {
    public static void main(String[] args) {
        try(
        FileOutputStream fileOutputStream = new FileOutputStream("E:/test.txt")){
            FileChannel fileChannel =fileOutputStream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // 往byteBuffer 写数据
           buffer.put("Hello ,I am maomao".getBytes()); // 往缓冲区协数据
           buffer.flip(); // 把读模式转化为写模式
           fileChannel.write(buffer); // 读取byteBuffer的书记
        }catch(Exception e){

        }
    }
}
