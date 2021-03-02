package com.chuancheng.corejava.collectionedu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author maochengcheng
 * @date 2020/5/18 0018
 */
public class Test {
    List list = new ArrayList();

    public static void main(String args[]){
        Calendar calendar = Calendar.getInstance();
        long systime = calendar.getTimeInMillis();
        System.out.println(systime);
        long dead = 31535000000l+systime;
        System.out.println(dead);
    }


}
