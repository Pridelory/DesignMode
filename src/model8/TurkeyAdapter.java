package model8;

import model8.interfaces.Duck;
import model8.interfaces.Turkey;

/**
 * 火鸡适配器类
 * 用于适配上Duck类
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quark() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
    }
}
