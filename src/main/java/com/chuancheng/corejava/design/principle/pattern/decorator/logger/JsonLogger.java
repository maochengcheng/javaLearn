package com.chuancheng.corejava.design.principle.pattern.decorator.logger;

import net.sf.json.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * @author maochengcheng
 * @date 2021/8/8 0008
 */
public class JsonLogger extends LoggerDecorator {
    public JsonLogger(Logger logger){
        super(logger);
    }

    @Override
    public void info(String msg) {
        JSONObject result = newJsonResult();
        result.put("message",msg);
        logger.info(result.toString());
    }

    @Override
    public void error(String msg) {
        JSONObject result = newJsonResult();
        result.put("message",msg);
        logger.info(result.toString());
    }

    public void err(Exception e){
        JSONObject result = newJsonResult();
        result.put("exception",e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("stackTrace",trace);
        logger.info(result.toString());
    }

    private JSONObject newJsonResult(){

        return new JSONObject();
    }
}
