package com.chuancheng.corejava.design.principle.pattern.delegate.mvc;

import com.chuancheng.corejava.design.principle.pattern.delegate.mvc.controller.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: maochengcheng
 * @date: 2021/9/13
 * @function: 跳转
 */
public class DispatcherServlet extends HttpServlet {

    private Map<String,Method> handlerMapping = new HashMap<String, Method>();
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDisPatch(req, resp);
    }

    private void doDisPatch(HttpServletRequest req, HttpServletResponse resp) {
        String url = req.getRequestURI();
        Method method = handlerMapping.get(url);
       // method.invoke();
    }

    @Override
    public void init() throws ServletException {
        try {
            handlerMapping.put("/web/getMemberById.json", MemberController.class.getMethod("getMemberById", new Class[]{String.class}));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
