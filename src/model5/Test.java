package model5;

import model5.handlers.TimeHandler;
import model5.interfaces.Animal;
import model5.interfaces.impl.Dog;
import model5.interfaces.impl.Tank;
import model5.interfaces.Moveable;
import sun.misc.ProxyGenerator;
import sun.tools.asm.CatchData;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //加上这句会在项目下生成对应的代理类
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Tank tank = new Tank();
        TimeHandler timeHandler = new TimeHandler(tank);
        Moveable m = (Moveable)Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Moveable.class}, timeHandler);
        m.move();

        System.out.println("----------------------------");

        Dog dog = new Dog();
        TimeHandler dogTimeHandler = new TimeHandler(dog);
        Animal animal = (Animal)Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Animal.class}, dogTimeHandler);
        animal.eat();
    }
}
