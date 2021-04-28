package com.chuancheng.corejava.design.principle.openclose;

/**
 * @author maochengcheng
 * @date 2021/4/28 0028
 */
public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return this.getPrice()*0.6;
    }
}
