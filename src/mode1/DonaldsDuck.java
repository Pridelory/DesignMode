package mode1;

import mode1.fly.impl.FlyWithWings;

/**
 * 唐老鸭
 * 实现了鸭子抽象类
 */
public class DonaldsDuck extends Duck {

    public DonaldsDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Donalds duck");
    }
}
