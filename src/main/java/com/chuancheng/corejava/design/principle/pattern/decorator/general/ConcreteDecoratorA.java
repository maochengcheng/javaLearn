package com.chuancheng.corejava.design.principle.pattern.decorator.general;

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component){
        super(component);
    }
    private void operationFirst(){}  //在调用父类的operation方法之前需要执行的操作
    private void operationLast(){} //在调用父类的operation方法之后需要执行的操作
    public void operation(){
        //调用父类的方法，可以在调用前后执行一些附加动作
        operationFirst();//添加的功能
        super.operation();//这里可以选择性的调用父类的方法，如果不调用则详单与完全改写了方法，实现
        operationLast();
    }
}
