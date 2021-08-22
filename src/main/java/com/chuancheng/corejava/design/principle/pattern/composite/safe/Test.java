package com.chuancheng.corejava.design.principle.pattern.composite.safe;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("=============安全模式写法==============");
        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件",2);
        File word = new File("Word.exe");
        File excel = new File("Execl.exe");

        office.add(word);
        office.add(excel);

        Folder root = new Folder("D盘",1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("===============show()=============");
        root.show();
        System.out.println("===============list()=============");
        root.list();
    }
}
