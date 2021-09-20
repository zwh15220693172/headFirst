package factory.staticFactory;

import factory.Pizza;

public class TestDemo {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        Pizza cheese = orderPizza.orderPizza("cheese");
        cheese.prepare();
        cheese.cook();
        cheese.cut();
    }
}
