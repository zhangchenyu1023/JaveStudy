package Reflect;

/**
    获取Class对象的方式：
        1.Class.forName("全类名")
        2.类名.class
        3.对象.getClass()
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=Class.forName("Reflect.Person");
        System.out.println(cls1);

        Class cls2=Person.class;
        System.out.println(cls2);

        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
    }
}
