package com.chuancheng.corejava.design.principle.pattern.memento.editor;

import java.util.Stack;

/**
 * @author: maochengcheng
 * @date: 2021/10/11
 * @function: 草稿箱
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }
    public void addMemento(ArticleMemento articleMemento){
        STACK.push(articleMemento);
    }
}
