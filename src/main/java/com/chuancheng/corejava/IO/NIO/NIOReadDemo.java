package com.chuancheng.corejava.IO.NIO;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class NIOReadDemo {
    public static void main(String[] args) {
        try(
        FileInputStream fileInputStream = new FileInputStream("E:/test.txt")){
            //Channel
            // 针对本地磁盘的文件进行操作
            FileChannel fileChannel = fileInputStream.getChannel();
            //读取数据，分配缓冲区的大小
            ByteBuffer buffer = ByteBuffer.allocate(100);
            //和上面一个意思
           /* byte[] bytes = new byte[100];
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);*/
            while(fileChannel.read(buffer)!=-1){

            }
            int rs = fileChannel.read(buffer);


        }catch (Exception e){

        }
    }
}
