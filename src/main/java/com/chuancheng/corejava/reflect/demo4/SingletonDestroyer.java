package com.chuancheng.corejava.reflect.demo4;

import java.lang.reflect.Constructor;

/**
 * @author maochengcheng
 * @date 2020/5/11 0011
 */
public class SingletonDestroyer {

    public static void main(String[] args)  throws Exception{
        Lazy lazyInstace = Lazy.getInstance();

        Constructor constructor = Lazy.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        Lazy lazyInstanceReflect = (Lazy)constructor.newInstance();

        System.out.println(lazyInstace);
        System.out.println(lazyInstanceReflect);
        System.out.println(lazyInstace == lazyInstanceReflect);
    }
}
