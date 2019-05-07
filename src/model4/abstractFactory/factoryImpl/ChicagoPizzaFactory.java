package model4.abstractFactory.factoryImpl;

import model4.abstractFactory.PizzaAbasractFactory;
import model4.abstractFactory.sourceInterface.Cheese;
import model4.abstractFactory.sourceInterface.Clam;
import model4.abstractFactory.sourceInterface.Dough;
import model4.abstractFactory.sourceInterface.Sauce;
import model4.abstractFactory.sourceInterface.sourceImpl.FrozenClam;
import model4.abstractFactory.sourceInterface.sourceImpl.ThickCrustDough;

/**
 * 芝加哥原料工厂
 */
public class ChicagoPizzaFactory implements PizzaAbasractFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
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
        return new FrozenClam();
    }
}
