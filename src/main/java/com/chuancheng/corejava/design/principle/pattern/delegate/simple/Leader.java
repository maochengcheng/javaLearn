package com.chuancheng.corejava.design.principle.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 团队领导，负责调度
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> employee = new HashMap<String,IEmployee>();

    public Leader(){
        employee.put("爬虫",new EmployeeA());
        employee.put("海报图",new EmployeeB());
    }
    public void doing(String task) {
        if(!employee.containsKey(task)){
            System.out.println("这个任务" + task + "做不了");
            return ;
        }
        employee.get(task).doing(task);
    }
}
