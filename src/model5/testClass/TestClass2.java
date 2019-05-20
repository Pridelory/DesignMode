package model5.testClass;

import model5.interfaces.impl.Tank;

public class TestClass2 {
    public static void main(String[] args) {
//        Tank tank = new Tank();
//        Class<? extends Tank> aClass = tank.getClass();
//        System.out.println(aClass.toString());
        try {
            Class<?> aClass = Class.forName("model5.interfaces.impl.Tank");
            Object o = aClass.newInstance();
            Tank tank = (Tank)o;
            tank.move();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
