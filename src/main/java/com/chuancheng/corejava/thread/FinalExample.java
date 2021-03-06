package com.chuancheng.corejava.thread;

/**
 * @author maochengcheng
 * @date 2021/3/16 0016
 */

/**
 * 构造函数内对一个final域的写入，与随后把这个被构造对象的引用赋值给一个引用变量，这两个操作之间不能重排序
 * 初次读一个包含final域的对象的引用，与随后初次读这个final域，这两个操作之间不能重排序
 */
public class FinalExample {
    int i;                              //普通变量
    final int j;                        //final变量
    static FinalExample obj;
    public FinalExample(){             //构造函数
        i = 1;                         //写普通域
        j = 2;                         //写final域
    }

    public static void writer(){
        obj = new FinalExample();
    }

    public static void reader(){
        FinalExample object = obj;        //读对象引用
        int a = object.i;                 //读普通域
        int b = object.j;                 //读final域
    }
}
