package com.chuancheng.corejava.design.principle.compositereuse;

public class CopTest {
    public static void main(String[] args) {
        ProductDao productDao  = new ProductDao();
        productDao.setDbConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
