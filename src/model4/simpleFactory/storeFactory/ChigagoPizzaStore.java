package model4.simpleFactory.storeFactory;

import model4.simpleFactory.pizza.ChicagoStyleCheesePizza;
import model4.simpleFactory.pizza.Pizza;

/**
 * 芝加哥披萨工厂
 */
public class ChigagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
