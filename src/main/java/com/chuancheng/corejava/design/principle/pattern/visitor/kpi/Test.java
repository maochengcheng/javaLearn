package com.chuancheng.corejava.design.principle.pattern.visitor.kpi;


/**
 * @author: maochengcheng
 * @date: 2021/10/15
 * @function: 测试客户端
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("=================CEO看报表=========================");
        businessReport.showReport(new CEOVistitor());
        System.out.println("=================CTO看报表=========================");
        businessReport.showReport(new CTOVistitor());
    }
}
