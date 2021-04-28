package com.chuancheng.corejava.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author maochengcheng
 * @date 2021/3/24 0024
 */
public class MemoryDemo {
    static String str = "hello world";

    public static void main(String[] args) {
        //从内存中读取数据
        ByteArrayInputStream inputStream = new ByteArrayInputStream(str.getBytes());
        //写出到内存中
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int i = 0;
        while((i=inputStream.read())!=-1){
            char c=(char)i;
            outputStream.write(Character.toUpperCase(c));
        }
        System.out.println(outputStream.toString());
    }
}
