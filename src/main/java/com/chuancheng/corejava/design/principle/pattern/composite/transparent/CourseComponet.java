package com.chuancheng.corejava.design.principle.pattern.composite.transparent;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public abstract class CourseComponet {

    public void addChild(CourseComponet componet){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponet componet){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CourseComponet componet){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponet componet){
        throw new UnsupportedOperationException("不支持获取价格");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
