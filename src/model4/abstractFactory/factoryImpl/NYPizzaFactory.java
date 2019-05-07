package model4.abstractFactory.factoryImpl;

import model4.abstractFactory.PizzaAbasractFactory;
import model4.abstractFactory.sourceInterface.Cheese;
import model4.abstractFactory.sourceInterface.Clam;
import model4.abstractFactory.sourceInterface.Dough;
import model4.abstractFactory.sourceInterface.Sauce;
import model4.abstractFactory.sourceInterface.sourceImpl.FreshClam;
import model4.abstractFactory.sourceInterface.sourceImpl.ThinCrustDough;

/**
 * 纽约原料工厂
 */
public class NYPizzaFactory implements PizzaAbasractFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
