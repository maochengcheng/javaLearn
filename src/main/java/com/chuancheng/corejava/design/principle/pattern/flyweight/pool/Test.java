package com.chuancheng.corejava.design.principle.pattern.flyweight.pool;

import java.sql.Connection;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
