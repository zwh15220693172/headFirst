package factory.abstractFactory;

import factory.ChCheesePizza;
import factory.ChPepperPizza;
import factory.Pizza;

public class ChPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String orderType) {
        {
            Pizza pizza = null;
            if (orderType.equals("cheese")) {
                pizza = new ChCheesePizza();
            } else {
                pizza = new ChPepperPizza();
            }
            return pizza;
        }
    }
}
