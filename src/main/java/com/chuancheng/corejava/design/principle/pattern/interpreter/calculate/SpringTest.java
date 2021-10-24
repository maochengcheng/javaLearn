package com.chuancheng.corejava.design.principle.pattern.interpreter.calculate;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author: maochengcheng
 * @date: 2021/10/13
 * @function: spring
 */
public class SpringTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        Integer result = (Integer)expression.getValue();
        System.out.println("result:" + result);

    }
}
