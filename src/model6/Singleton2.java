package model6;

/**
 * 单例设计模式--饿汉式
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getUniqueInstance() {
        return uniqueInstance;
    }
}
