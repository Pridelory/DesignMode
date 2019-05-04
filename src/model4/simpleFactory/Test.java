package model4.simpleFactory;

import model4.simpleFactory.pizza.Pizza;
import model4.simpleFactory.storeFactory.NYPizzaStore;
import model4.simpleFactory.storeFactory.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NYPizzaStore();
        Pizza cheesePizza = pizzaStore1.orderPizza("cheese");
        System.out.println(cheesePizza.getName());
    }
}
