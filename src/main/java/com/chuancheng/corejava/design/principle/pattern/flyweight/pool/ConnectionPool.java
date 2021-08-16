package com.chuancheng.corejava.design.principle.pattern.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author: maochengcheng
 * @date: 2021/8/15 0015
 * @function:
 */
public class ConnectionPool {
    private Vector<Connection> pool ;
    private static final int poolSize = 100;
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    public ConnectionPool() {
        pool = new Vector<Connection>(poolSize);

        for (int i = 0; i < poolSize ; i++) {
            try {
                Class.forName(driverClassName);
                Connection conn = DriverManager.getConnection(url,username,password);
                pool.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection(){
        if(pool.size() > 0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized void release(Connection conn){
        pool.add(conn);
    }
}
