package com.chuancheng.corejava.design.principle.compositereuse;

public class MyOracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "获取Oracle数据链接";
    }
}
