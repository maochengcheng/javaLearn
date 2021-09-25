package com.chuancheng.corejava.design.principle.pattern.iterator.course;

/**
 * @author: maochengcheng
 * @date: 2021/9/18
 * @function: 迭代器接口
 */
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
