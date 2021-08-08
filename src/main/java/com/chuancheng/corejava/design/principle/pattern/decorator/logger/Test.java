package com.chuancheng.corejava.design.principle.pattern.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class Test {
    //private static final Logger logger = LoggerFactory.getLogger(Test.class);
   private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.error("系统错误");
    }
}
