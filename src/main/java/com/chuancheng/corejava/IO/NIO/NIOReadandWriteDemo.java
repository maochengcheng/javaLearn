package com.chuancheng.corejava.IO.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class NIOReadandWriteDemo {
    public static void main(String[] args) {
        try(
                FileInputStream fileInputStream = new FileInputStream("E:/test.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("E:/test_cp.txt")
                ){
            FileChannel fcin =fileInputStream.getChannel();
            FileChannel fout = fileOutputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);
            while(true){
               int i = fcin.read(byteBuffer);
               if(i==-1){
                   break;
               }
               //每读到10个字节，写入缓冲区
               byteBuffer.flip();
               fout.write(byteBuffer);
               byteBuffer.clear(); //清空
            }
        }catch (Exception e){

        }
    }
}
