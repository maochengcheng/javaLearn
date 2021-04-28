package com.chuancheng.corejava.IO.NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class NIOFirstDemo {
    public static void main(String[] args) {
            try {
                FileInputStream  fis = new FileInputStream(new File("E:/test.txt"));
                FileOutputStream fos = new FileOutputStream(new File("E:/test_cp.txt"));
                //NIO  channel -buffer
                FileChannel fin = fis.getChannel();
                FileChannel fout = fos.getChannel();

                //初始一个缓冲区
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                fin.read(buffer);//读取数据到缓冲区
                buffer.flip(); //表示从读转化为写
                fout.write(buffer);
                buffer.clear(); //重置缓冲区

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
