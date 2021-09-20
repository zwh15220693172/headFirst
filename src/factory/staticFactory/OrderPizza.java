package factory.staticFactory;

import factory.Pizza;

public class OrderPizza {
    public Pizza orderPizza(String orderType){
        return PizzaFactory.createPizza(orderType);
    }
}
