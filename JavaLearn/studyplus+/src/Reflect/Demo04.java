package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*1.获取成员方法们
    Class对象的方法：
    Method[] getMethods()
    Method getMethod(String name, Class<?>... parameterTypes)

    Method[] getDeclaredMethods()
    Method getDeclaredMethod(String name, Class<?>... parameterTypes)

    执行方法
    Method对象的方法
    Object invoke(Person obj, Object... args)
    String getName()  以 String 形式返回此 Method 对象表示的方法名称。
 */
public class Demo04 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class personClass=Person.class;
        Person p=new Person();
        Method eat=personClass.getMethod("eat");
        eat.invoke(p);

        Method[] methods=personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
    }





}
