package Reflect;

import java.lang.reflect.Field;

/*1.获取成员变量们
    Class对象的方法：
    Field[] getFields() 获取所有public修饰的成员变量
    Field getField(String name) 获取指定名称的public修饰的成员变量

    Field[] getDeclaredFields() 获取所有成员变量
    Field getDeclaredField(String name) 获取指定名称的成员变量

    访问和修改成员变量的值
    Field对象的方法：
    void set(Person obj, value) 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
    Object get(Person obj) 返回指定对象上此 Field 表示的
    void setAccessible(true); // 忽略访问权限修饰符的安全检查即可对私有成员变量访问和修改
*/
public class Demo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class personClass=Person.class;
        Person p=new Person();

        Field[] fields=personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------");
        Field a=personClass.getField("a");

        a.set(p,10); // void set(Object obj, Object value) 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
        Object value=a.get(p); //Object get(Object obj) 返回指定对象上此 Field 表示的字段的值
        System.out.println(value);

        System.out.println("-------------------");
        Field[] fields1=personClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("-------------------");
        Field name=personClass.getDeclaredField("name");

        name.setAccessible(true);// 忽略访问权限修饰符的安全检查即可对私有成员变量访问和修改
        name.set(p,"zhangsan");
        System.out.println(name.get(p));
    }





}
