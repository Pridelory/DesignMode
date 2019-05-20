动态代理设计模式

动态代理UML见本包图片

静态代理，就是在编译时期代理对象已经写好，并生成class文件。
动态代理，就是动态生成代理对象。在运行时期通过反射生成代理对象。
注：核心就是代理对象

主要就是newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)这个方法，
这就相当于一个工厂，来New一个代理类。
1、其中loader也就是类加载器，用户决定哪个类加载器用来加载代理类到虚拟机中。
2、interfaces定义生成的代理类的实现的接口，以及实现的方法。
3、h这个是用户自定义的处理，即对被代理类施加什么样的动作。可以通用



