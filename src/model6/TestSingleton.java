package model6;

public class TestSingleton {
    public static void main(String[] args) {
        //测试饿汉式
//        Singleton1 instance = Singleton1.getInstance();
//        Singleton1 instance1 = Singleton1.getInstance();
//        System.out.println(instance == instance1);

        //测试懒汉式
        Singleton2 uniqueInstance = Singleton2.getUniqueInstance();
        Singleton2 uniqueInstance1 = Singleton2.getUniqueInstance();
        System.out.println(uniqueInstance == uniqueInstance1);


    }
}
