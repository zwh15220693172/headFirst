package factory.abstractFactory;

import factory.Pizza;

/**
 * 抽象工厂模式
 */
public class OrderPizza {
    private PizzaFactory pizzaFactory;

    public OrderPizza(final PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String orderType){
        return pizzaFactory.createPizza(orderType);
    }

}
