package com.chuancheng.corejava.design.principle.pattern.memento.editor;

/**
 * @author: maochengcheng
 * @date: 2021/10/11
 * @function: 备忘录模式测试
 */
public class Test {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();

        Editor editor = new Editor("手写Spring","本文123123213213213213","1231321321321.png");
        ArticleMemento articleMemento = editor.saveToMemento();

        System.out.println("标题：" + editor.getTitle() + "\n" +
         "内容："+ editor.getContent() + "\n" +
        "插图：" + editor.getImgs() + "\n暂存成功");
        System.out.println("完整信息：" + editor);

        System.out.println("======================首次修改文章==================");
        editor.setTitle("[毛毛]手写Spring");
        editor.setContent("fdsafdsafdsafdsafdsafd");
        System.out.println("完整信息：" + editor);
        System.out.println("======================首次修改文章完成====================");


        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("=======================保存到草稿箱==============================");

        System.out.println("======================第2次修改文章==================");
        editor.setTitle("[成成]手写Spring 哈哈哈哈哈哈");
        editor.setContent("fdsafdsafdsafdsafdsafd");
        System.out.println("完整信息：" + editor);
        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("======================第2次修改文章完成====================");

        System.out.println("======================第1次撤销回退==================");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整信息：" + editor);
        System.out.println("======================第1次撤销回退完成==================");

        System.out.println("======================第2次撤销回退==================");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("完整信息：" + editor);
        System.out.println("======================第2次撤销回退完成==================");
    }
}
