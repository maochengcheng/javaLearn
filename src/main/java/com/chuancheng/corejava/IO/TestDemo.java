package com.chuancheng.corejava.IO;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/27 0027
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        //磁盘io
        /*try {
            FileInputStream inputStream = new FileInputStream("E/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        //内存
        /*String str= "Hello world";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        int i = 0;
        while((i=byteArrayInputStream.read())!=-1){
            System.out.print((char)i);
        }*/

        //键盘
        InputStream inputStream = System.in;
        int i= 0;
        while((i=inputStream.read())!=-1){
            System.out.print((char)i);
        }

    }
}
