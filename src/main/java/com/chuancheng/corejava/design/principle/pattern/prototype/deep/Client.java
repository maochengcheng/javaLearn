package com.chuancheng.corejava.design.principle.pattern.prototype.deep;

import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("毛毛");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("下棋");
        hobbies.add("打球");

        concretePrototype.setHobbies(hobbies);

        ConcretePrototype clone = concretePrototype.deepClone2();

        clone.getHobbies().add("游泳");

        System.out.println("原型对象:"+concretePrototype);
        System.out.println("克隆对象:"+clone);
        System.out.println(clone == concretePrototype);

        System.out.println("原型爱好对象："+ concretePrototype.getHobbies());
        System.out.println("克隆爱好对象："+clone.getHobbies());

        System.out.println(concretePrototype.getHobbies() == clone.getHobbies());

       /* ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("毛毛");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("下棋");
        hobbies.add("打球");
        concretePrototype.setHobbies(hobbies);

        JSONObject json = JSONObject.fromObject(concretePrototype);
        System.out.println(json);*/
    }
}
