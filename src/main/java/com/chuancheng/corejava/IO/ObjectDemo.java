package com.chuancheng.corejava.IO;

import java.io.*;

/**
 * @author maochengcheng
 * @date 2021/3/29 0029
 */
public class ObjectDemo {
    public static void main(String[] args) {
        //序列化
       /*
       User user = new User("毛毛",18);
        try(
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("E:/user"))){
          objectOutputStream.writeObject(user);
        }catch(Exception e){

        }*/

       //反序列化
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:/user"))
                ){
           User user = (User)objectInputStream.readObject();
            System.out.println("result:"+user);
        }catch (Exception e){

        }
    }
}
