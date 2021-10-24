package com.chuancheng.corejava.design.principle.pattern.interpreter.calculate;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 乘法非终结表达式
 */
public class MultilInterpreter extends Interpreter{

    public MultilInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
