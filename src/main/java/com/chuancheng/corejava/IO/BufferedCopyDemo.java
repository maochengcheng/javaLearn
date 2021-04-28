package com.chuancheng.corejava.IO;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/24 0024
 */
public class BufferedCopyDemo {
    private static File fileSource = new File("E:/cas.war");
    private static File fileTarget = new File("E:/cas_copy.war");

    public void copyWithNormal(){
        try(
                FileInputStream inputStream = new FileInputStream(fileSource);
                FileOutputStream outputStream = new FileOutputStream(fileTarget)

        ){
            byte[] buf = new byte[1024];
            int len = 0;
            while((len=inputStream.read(buf))!=-1){
              outputStream.write(buf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void copyWithBuffered(){
        try(
                FileInputStream inputStream = new FileInputStream(fileSource);
                FileOutputStream outputStream = new FileOutputStream(fileTarget);
                BufferedInputStream bis = new BufferedInputStream(inputStream);
                BufferedOutputStream bos = new BufferedOutputStream(outputStream)
                ){
            byte[] buf = new byte[1024];
            int len = 0;
            while((len=bis.read(buf))!=-1){
                bos.write(buf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BufferedCopyDemo bcd = new BufferedCopyDemo();
        long star = System.currentTimeMillis();
        bcd.copyWithNormal();
        System.out.println("普通流复制时间:"+(System.currentTimeMillis()-star));

        long starb =System.currentTimeMillis();
        bcd.copyWithBuffered();
        System.out.println("缓冲流复制时间："+(System.currentTimeMillis()-starb));

    }
}
