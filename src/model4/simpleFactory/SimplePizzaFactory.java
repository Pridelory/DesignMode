package model4.simpleFactory;

import model4.simpleFactory.pizza.CheesePizza;
import model4.simpleFactory.pizza.ClamPizza;
import model4.simpleFactory.pizza.Pizza;

/**
 * 简单工厂
 */
public class SimplePizzaFactory {

    static Pizza pizza;

    public static Pizza createPizza(String value) {
        if (value.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (value.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
