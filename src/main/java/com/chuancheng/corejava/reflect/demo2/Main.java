package com.chuancheng.corejava.reflect.demo2;

public class Main {
    public static void main(String[] args) {

        String key = "Excel";
        Office office = getInstanceReflectByKey(key);
        System.out.println(office);
    }

    public static Office getInstanceReflectByKey(String key){
        String packageName= "com.chuancheng.corejava.reflect.demo2";
        Office office = null;
        try{
            Class clazz =Class.forName(packageName+"."+key);
            office = (Office)clazz.newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return office;
    }
}
