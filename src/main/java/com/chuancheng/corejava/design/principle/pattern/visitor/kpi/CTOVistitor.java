package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;

/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function: 具体访问者
 */
public class CTOVistitor implements IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师" + engineer.name + "，代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理" + manager.name + "，新产品数：" + manager.getProducts());
    }
}
