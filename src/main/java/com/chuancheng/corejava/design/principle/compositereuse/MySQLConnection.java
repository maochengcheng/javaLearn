package com.chuancheng.corejava.design.principle.compositereuse;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "获取Mysql数据链接";
    }
}
