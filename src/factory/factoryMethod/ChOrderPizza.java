package factory.factoryMethod;

import factory.ChCheesePizza;
import factory.Pizza;

public class ChOrderPizza extends OrderPizza{
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new ChCheesePizza();
        } else {
            pizza = new ChCheesePizza();
        }
        return pizza;
    }
}
