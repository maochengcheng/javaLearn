package com.chuancheng.corejava.IO;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/24 0024
 */
public class BufferedDemo {
    public static void main(String[] args)  {
        try (
        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream("E:/test.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("E:/test2.txt"))
        ){
            int len = 0;
            byte[] bys = new byte[1024];
            while (((len=bufferedInputStream.read(bys))!=-1)){
                System.out.println(new String(bys,0,len));

                bufferedOutputStream.write(bys,0,len);
                bufferedOutputStream.flush();//?
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }

