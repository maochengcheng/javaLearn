package com.chuancheng.corejava.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author maochengcheng
 * @date 2021/3/26 0026
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8080);
        //我想发送一个数据到服务端
        OutputStream outputStream = socket.getOutputStream();//输出流
        outputStream.write("Hello maomao".getBytes("UTF-8"));
        outputStream.close();
        socket.close();
    }
}
