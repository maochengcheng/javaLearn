package com.chuancheng.corejava.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author maochengcheng
 * @date 2021/3/22 0022
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        //固定的写法
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =new FileInputStream("E:/test.txt");
            int i = 0;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i); //ASCII 码
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
