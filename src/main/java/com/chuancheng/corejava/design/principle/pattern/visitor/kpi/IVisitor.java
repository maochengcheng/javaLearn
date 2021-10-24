package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;

/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function: 抽象访问者
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
