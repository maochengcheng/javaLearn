package com.chuancheng.corejava.design.principle.pattern.prototype.deep;

import lombok.Data;
import net.sf.json.JSONObject;

import java.io.*;
import java.util.List;

@Data
public class ConcretePrototype implements Cloneable, Serializable {
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype)ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //通过json字符串进行克隆
    public ConcretePrototype deepClone2(){
        JSONObject conJson = JSONObject.fromObject(this);
        System.out.println(conJson);
        ConcretePrototype re = (ConcretePrototype)JSONObject.toBean(conJson,ConcretePrototype.class);
        return re;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
