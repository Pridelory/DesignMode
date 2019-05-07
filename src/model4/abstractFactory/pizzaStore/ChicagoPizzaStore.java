package model4.abstractFactory.pizzaStore;

import model4.abstractFactory.PizzaAbasractFactory;
import model4.abstractFactory.factoryImpl.ChicagoPizzaFactory;
import model4.abstractFactory.pizza.ClamPizza;
import model4.abstractFactory.pizza.Pizza;

/**
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaAbasractFactory pizzaAbasractFactory =
                new ChicagoPizzaFactory();
        if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaAbasractFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
