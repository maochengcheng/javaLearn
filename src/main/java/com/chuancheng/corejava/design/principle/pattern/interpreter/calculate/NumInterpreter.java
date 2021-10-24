package com.chuancheng.corejava.design.principle.pattern.interpreter.calculate;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 终结表达式
 */
public class NumInterpreter implements IArithmeticInterpreter{
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
