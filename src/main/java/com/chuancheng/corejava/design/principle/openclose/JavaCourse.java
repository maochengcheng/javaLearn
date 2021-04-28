package com.chuancheng.corejava.design.principle.openclose;

/**
 * @author maochengcheng
 * @date 2021/4/28 0028
 */
public class JavaCourse implements ICourse{

    private Integer id;

    private String name;

    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
