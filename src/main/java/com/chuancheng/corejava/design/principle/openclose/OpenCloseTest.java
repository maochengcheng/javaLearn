package com.chuancheng.corejava.design.principle.openclose;

/**
 * @author maochengcheng
 * @date 2021/4/28 0028
 */
public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(1,"Java架构",11800D);

        System.out.println(
                    "课程ID: " + course.getId() +
                    "\n课程名称：" + course.getName()  +
                            "\n课程原价：" + course.getPrice()  +
                    "\n课程折后价：" + ((JavaDiscountCourse)course).getDiscountPrice() );
    }
}
