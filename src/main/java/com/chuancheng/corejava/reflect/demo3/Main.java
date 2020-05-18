package com.chuancheng.corejava.reflect.demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
       // basicOper();
       // filedOper();
        methodOper();
       // constructorOper();
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

    public static void filedOper() throws Exception {
        Class clazz = Boy.class;

        Boy boy = (Boy)clazz.newInstance();
       Field[] fields = clazz.getFields(); // 获取当前类中所有的公有字段，包含继承
        System.out.println(fields.length);
        for(int i =0;i<fields.length;i++){
            System.out.println(fields[i]);
        }

        Field nameField = clazz.getField("name");
        System.out.println(nameField.getName());

        Field [] fields2 = clazz.getDeclaredFields();  //获取当前类中所有字段
        System.out.println(fields2.length);

        for(int i =0;i<fields2.length;i++){
            System.out.println(fields2[i]);
        }

        Field weightfield = clazz.getDeclaredField("weight");
        System.out.println(weightfield.getModifiers());

        nameField.set(boy,"张三");
        System.out.println(boy.name);

        weightfield.setAccessible(true); //让私有的字段进行强制访问
        weightfield.set(boy,180);
        System.out.println(boy.getWeight());

        Field descField = clazz.getField("desc");
        descField.set(null,"这是一个静态属性内容！");
        System.out.println(Boy.desc);
    }

    public static void methodOper() throws Exception{
        Class clazz =Boy.class;
        Boy boy = (Boy)clazz.newInstance();
        Method[] methods = clazz.getMethods();
        System.out.println(methods.length);

        for(int i =0;i<methods.length;i++){
            System.out.println(methods[i]);
        }

        Method talkMethod = clazz.getMethod("talk");
        System.out.println(talkMethod.getName());

        Method playBallMethod = clazz.getMethod("playBall", String.class);
        System.out.println(playBallMethod.getName());
        System.out.println(playBallMethod.getModifiers());
        playBallMethod.invoke(boy,"乒乓球");

        /**
         * 私有方法
         */
        Method [] methods2 = clazz.getDeclaredMethods();
        System.out.println(methods2.length);
        Method pickUpGirlMethod = clazz.getDeclaredMethod("pickUpGirl");
        System.out.println(pickUpGirlMethod.getModifiers());
        pickUpGirlMethod.setAccessible(true);
        pickUpGirlMethod.invoke(boy);

        /**
         * 静态方法调用
         */
        Method playBasketballMethod = clazz.getDeclaredMethod("playBasketball");
        playBasketballMethod.invoke(null);
    }

    public static void  constructorOper() throws Exception{
        Class clazz =Boy.class;
        clazz.newInstance();  //基于constructor进行对象的构建
        System.out.println(clazz.getConstructors().length);
        System.out.println(clazz.getDeclaredConstructors().length);

        Constructor constructor = clazz.getDeclaredConstructor();

        Constructor constructor1 = clazz.getDeclaredConstructor(int.class);

        Constructor constructor2 = clazz.getDeclaredConstructor(int.class,int.class);

        System.out.println(constructor.getModifiers());
        System.out.println(constructor1.getModifiers());
        System.out.println(constructor2.getModifiers());

        Boy boy = (Boy)constructor.newInstance();
        System.out.println(boy);

        boy = (Boy)constructor2.newInstance(176,130);
        System.out.println(boy.getWeight());

        constructor1.setAccessible(true);
        boy = (Boy)constructor1.newInstance(176);
        System.out.println(boy.height);
    }
}
