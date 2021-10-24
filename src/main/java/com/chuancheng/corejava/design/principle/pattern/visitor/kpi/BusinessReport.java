package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function: 业务报表
 */
public class BusinessReport {
    private List<Employee> employees = new ArrayList<>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Engineer("程序员B"));
        employees.add(new Engineer("程序员c"));
        employees.add(new Engineer("程序员D"));
    }

    public void showReport(IVisitor visitor){
        for (Employee employee: employees) {
            employee.accept(visitor);
        }
    }
}
