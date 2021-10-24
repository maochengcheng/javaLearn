package com.chuancheng.corejava.design.principle.pattern.memento.editor;

/**
 * @author: maochengcheng
 * @date: 2021/10/11
 * @function: 文章对象
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }
}
