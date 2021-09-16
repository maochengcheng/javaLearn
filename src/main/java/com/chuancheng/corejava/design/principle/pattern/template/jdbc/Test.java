package com.chuancheng.corejava.design.principle.pattern.template.jdbc;

import com.chuancheng.corejava.design.principle.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 测试方法
 */
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
    }
}
