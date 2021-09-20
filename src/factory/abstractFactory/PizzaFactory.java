package factory.abstractFactory;

import factory.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String orderType);
}
