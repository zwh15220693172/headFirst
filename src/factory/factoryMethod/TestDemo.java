package factory.factoryMethod;

import factory.Pizza;

/**
 * 工厂方法模式
 */
public class TestDemo {
    public static void main(String[] args) {
        OrderPizza orderPizza = new ChOrderPizza();
        Pizza pizza = orderPizza.orderPizza("pepper");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
    }
}
