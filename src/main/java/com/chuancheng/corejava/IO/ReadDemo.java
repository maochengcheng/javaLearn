package com.chuancheng.corejava.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author maochengcheng
 * @date 2021/3/28 0028
 */
public class ReadDemo {
    public static void main(String[] args) {
        try(
        FileInputStream fileInputStream = new FileInputStream("E:/test.txt")){
            int i =0;
            byte[] buff = new byte[3]; //占用内存空间
            while((i=fileInputStream.read(buff))!=-1){
              //  System.out.print((char)i);
                // 增加了buffer，原来要进行11次，现在只需要进行四次交互
                //如果把buffer的长度等于读取的字节长度，那智慧经过一次io操作
                System.out.println(new String(buff,0,i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
