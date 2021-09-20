package factory.abstractFactory;

import factory.Pizza;

public class TestDemo {
    public static void main(String[] args) {
        ChPizzaFactory chPizzaFactory = new ChPizzaFactory();
        OrderPizza orderPizza = new OrderPizza(chPizzaFactory);
        Pizza pizza = orderPizza.orderPizza("cheese");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
    }
}
