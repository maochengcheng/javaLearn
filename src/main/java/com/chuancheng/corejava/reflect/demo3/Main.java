package com.chuancheng.corejava.reflect.demo3;

public class Main {
    public static void main(String[] args) {
        basicOper();
    }

    public static void basicOper()  {
        /**
         * 获取一个Class的对象实例
         */
        Class clazz = Boy.class;
        Class clazz2 = new Boy().getClass();
        try{
            Class clazz3 = Class.forName("com.chuancheng.corejava.reflect.demo3.Boy");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            Class class4 = Main.class.getClassLoader().loadClass("com.chuancheng.corejava.reflect.demo3.Boy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int modifers = clazz.getModifiers();
        System.out.println("modifers:"+modifers);
        Package boyPkg = clazz.getPackage();
        System.out.println("boyPkg:"+boyPkg);

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println(clazz.getClassLoader());

        System.out.println(clazz.getInterfaces().length);

        System.out.println(clazz.getSuperclass());

        System.out.println(clazz.getAnnotations().length);
    }
}
