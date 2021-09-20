package factory.factoryMethod;

import factory.Pizza;

/**
 * 工厂方法模式
 */
public abstract class OrderPizza {

    public Pizza orderPizza(String orderType){
        return createPizza(orderType);
    }

    protected abstract Pizza createPizza(String orderType);
}
