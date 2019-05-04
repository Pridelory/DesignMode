package model4.simpleFactory.storeFactory;

import model4.simpleFactory.pizza.NYStyleCheesePizza;
import model4.simpleFactory.pizza.Pizza;

/**
 * 纽约披萨工厂
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        //以下省略
        return null;
    }
}
