package com.chuancheng.corejava.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author maochengcheng
 * @date 2021/3/28 0028
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bufferedOutputStream = new
                BufferedOutputStream(new FileOutputStream("E:/text.txt"));
        bufferedOutputStream.write("hello world".getBytes());
      //  bufferedOutputStream.flush();//刷盘动作
        bufferedOutputStream.close(); //close 方法也会触发刷盘操作

    }
}
