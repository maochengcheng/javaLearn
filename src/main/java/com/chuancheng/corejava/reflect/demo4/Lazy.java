package com.chuancheng.corejava.reflect.demo4;

/**
 * @author maochengcheng
 * @date 2020/5/10 0010
 */
public class Lazy {
     private static Lazy instance;

     private Lazy(){}

     public static Lazy getInstance(){
         if(instance == null){
             synchronized(Lazy.class){
                 if(instance ==null){
                     instance = new Lazy();
                 }
             }
         }
         return instance;
     }
}
