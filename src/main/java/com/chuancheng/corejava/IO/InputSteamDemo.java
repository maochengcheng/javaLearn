package com.chuancheng.corejava.IO;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/28 0028
 */
public class InputSteamDemo {
    public static void main(String[] args) {
        File file = new File("E:/test.txt");
        try {

            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(new File("E:/test_copy.txt"));
            int i= 0;
            while((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
            // try(){}  java 1.7 中语法，可以用这个代替 关闭流
            fileInputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
