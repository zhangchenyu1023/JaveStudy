package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*1.获取构造方法们
    Class对象的方法：
    Constructor<?> [] getConstructors()
    Consttuctor<T> getConstructor(Class<?>... parameterTypes)

    Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
    Constructor<?>[] getDeclaredConstructors()

    创建对象
    Constructor对象的方法
    newInstance(Object... initargs) 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化
    */
public class Demo03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class personClass=Person.class;

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Object person=constructor.newInstance("zhangsan",20);
        System.out.println(person);
    }





}
