package com.chuancheng.corejava.design.principle.pattern.factory.simplefactory;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        /*if("java".equals(name)){
            return new JavaCourse();
        }else if("lua".equals(name)){
            return new LuaCourse();
        }else{
            return null;
        }*/
        /*try {
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return  null;*/

        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;




    }
}
