package com.chuancheng.corejava.reflect.demo3;

public class Main {
    public static void main(String[] args) {

    }

    public void basicOper(){

        /**
         * 获取一个Class的对象实例
         */
        Class clazz = Boy.class;
        Class clazz2 = new Boy().getClass();
       // Class clazz3 = Class.forName()


    }
}
