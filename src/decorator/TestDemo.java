package decorator;

import decorator.drink.Coffee;
import decorator.mixed.Milk;
import decorator.mixed.Sugar;

/**
 * 装饰者模式为了动态的给对象添加功能
 */
public class TestDemo {
    public static void main(String[] args) {
        Component order = new Coffee();
        order = new Sugar(order);
        order = new Sugar(order);
        order = new Milk(order);
        System.out.println(order.des());
        System.out.println(order.cost());
    }
}
