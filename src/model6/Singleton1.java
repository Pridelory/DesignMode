package model6;

/**
 * 单例-懒汉模式
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance;

    //私有构造方法
    //只能在本类调用构造Singleton对象
    private Singleton1() {}

    //静态 直接通过类名调用
    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
