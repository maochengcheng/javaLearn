package com.chuancheng.corejava.IO;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class ConvertDemo {
    public static void main(String[] args) {
        try(BufferedInputStream  inputStream = new BufferedInputStream(new FileInputStream("E:/test.txt"))){
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
          BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.println(bufferedReader.readLine()); // 读取一行数据

            //字符转换流
            OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(new FileOutputStream("E:/test_cp.txt"),"UTF-8");
        BufferedWriter bufferedWriter  = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("你好，毛毛");
        bufferedWriter.flush();
         /* int i=0;
            char[] chars = new char[1024];
            while ((i=bufferedReader.read(chars))!=-1){
                System.out.println(new String(chars,0,i));
            }*/
        }catch (IOException e){

        }
    }
}
