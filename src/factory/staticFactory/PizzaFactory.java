package factory.staticFactory;

import factory.LdCheesePizza;
import factory.LdPepperPizza;
import factory.Pizza;

/**
 * 简单工厂模式又叫做静态工厂模式
 */
public class PizzaFactory {
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LdCheesePizza();
        } else {
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
