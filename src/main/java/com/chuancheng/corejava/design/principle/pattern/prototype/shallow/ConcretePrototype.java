package com.chuancheng.corejava.design.principle.pattern.prototype.shallow;

import lombok.Data;

import java.util.List;

@Data
public class ConcretePrototype implements Cloneable{
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

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
