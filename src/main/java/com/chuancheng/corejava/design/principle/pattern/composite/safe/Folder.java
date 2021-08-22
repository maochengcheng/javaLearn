package com.chuancheng.corejava.design.principle.pattern.composite.safe;

import com.chuancheng.corejava.design.principle.pattern.composite.transparent.CourseComponet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/8/16
 * @function:
 */
public class Folder extends Direcotry{

    private List<Direcotry> dirs;
    private Integer level;

    public Folder(String name,Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<Direcotry>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for (Direcotry c: dirs) {
            if(this.level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("     ");
                }
                for (int i = 0; i < this.level; i++) {
                    if(i == 0){
                        System.out.print("+");
                    }
                    System.out.print("-");

                }
            }

            c.show();

        }
    }

    public boolean add(Direcotry dir){
        return this.dirs.add(dir);
    }

    public boolean remove(Direcotry dir){
        return this.dirs.remove(dir);
    }

    public void list(){
        for (Direcotry dir : dirs) {
            System.out.println(dir.name);

        }
    }

}
