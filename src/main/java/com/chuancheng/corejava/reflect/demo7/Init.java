package com.chuancheng.corejava.reflect.demo7;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Init {

    public static void main(String[] args) throws Exception{
        List<BeanConfig> beanConfigs = parseXmltoBeanConfig();

        for (BeanConfig tmpconfig : beanConfigs) {
            if(null != tmpconfig.getClazz()){
                //拿到Clazz
                Class clazz = Class.forName(tmpconfig.getClazz());

                if(null != tmpconfig.getFactoryMethod()){
                    //基于class对象获取method方法
                    Method method = clazz.getDeclaredMethod(tmpconfig.getFactoryMethod());

                    IOCContainer.putBean(tmpconfig.getId(),method.invoke(null));
                }else{
                    //直接获取
                    IOCContainer.putBean(tmpconfig.getId(),clazz.newInstance());
                }
            } else if(null != tmpconfig.getFactoryBean()){
                //从容器中拿到实例bean
                Object obj = IOCContainer.getBean(tmpconfig.getFactoryBean());
                Method method = obj.getClass().getDeclaredMethod(tmpconfig.getFactoryMethod());
                IOCContainer.putBean(tmpconfig.getId(),method.invoke(obj));
            }else{
                System.out.println("配置文件有问题！");
            }
        }
    }


    private static List<BeanConfig> parseXmltoBeanConfig(){
        List<BeanConfig> beanConfigs = new ArrayList<>();
        BeanConfig beanConfig1 = new BeanConfig();
        beanConfig1.setClazz("com.chuancheng.corejava.reflect.demo6.A");
        beanConfig1.setId("a");
        beanConfigs.add(beanConfig1);

        BeanConfig beanConfig2 = new BeanConfig();
        beanConfig2.setClazz("com.chuancheng.corejava.reflect.demo6.A");
        beanConfig2.setId("b");
        beanConfig2.setFactoryMethod("createBobj");
        beanConfigs.add(beanConfig2);

        BeanConfig beanConfig3 = new BeanConfig();
        beanConfig3.setId("c");
        beanConfig3.setFactoryBean("a");
        beanConfig3.setFactoryMethod("createBobj");
        beanConfigs.add(beanConfig3);
        return beanConfigs;
    }

}
