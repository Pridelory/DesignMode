package model4.factoryMethod.storeFactory;

import model4.factoryMethod.pizza.Pizza;

/**
 * pizza工厂的抽象类
 */
public abstract class PizzaStore {

    Pizza pizza;

    public Pizza orderPizza(String type) {

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
