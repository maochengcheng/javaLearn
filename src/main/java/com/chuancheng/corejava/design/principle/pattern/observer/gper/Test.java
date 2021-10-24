package com.chuancheng.corejava.design.principle.pattern.observer.gper;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 测试客户端
 */
public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher mao = new Teacher("Mao");
        Teacher tom = new Teacher("Tom");

        gPer.addObserver(mao);
        gPer.addObserver(tom);

        // 用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");
        gPer.publicQuestion(question);
    }
}
