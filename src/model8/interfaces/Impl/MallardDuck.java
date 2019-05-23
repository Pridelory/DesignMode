package model8.interfaces.Impl;

import model8.interfaces.Duck;

/**
 * 绿头鸭实现类
 */
public class MallardDuck implements Duck{

    @Override
    public void quark() {
        System.out.println("Quark");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
