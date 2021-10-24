package com.chuancheng.corejava.design.principle.pattern.interpreter.calculate;

import java.util.Stack;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: 计算器
 */
public class Calculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<>();
    public Calculator(String expression){
        parse(expression);
    }

    // 10 + 30
    private void parse(String expression) {
        String [] elements = expression.split(" ");
        IArithmeticInterpreter left,right;

        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if(OperatorUtil.ifOperator(operator)){
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈" + left.interpret() + "和" + right.interpret());
                this.stack.push(OperatorUtil.getInterpreter(left,right,operator));
                System.out.println("应用运算符：" + operator);
            }else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                this.stack.push(numInterpreter);
                System.out.println("入栈：" + numInterpreter.interpret());

            }

        }
    }

    public int calulate(){
        return this.stack.pop().interpret();
    }
}
