package 接口;

/*

public interface 接口名称 {
    // 接口内容
}

1. 常量
2. 抽象方法：
3. 默认方法
4. 静态方法
5. 私有方法

接口使用步骤：
1.
public class 实现类名称 implements 接口名称 {
    // ...
}
2. 接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
   如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。

3. 创建实现类的对象，进行使用。

从Java 9开始，接口当中允许定义私有方法。
1. 普通私有方法，解决多个默认方法之间重复代码问题
格式：
private 返回值类型 方法名称(参数列表) {
    方法体
}

2. 静态私有方法，解决多个静态方法之间重复代码问题
格式：
private static 返回值类型 方法名称(参数列表) {
    方法体
}

接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。
从效果上看，这其实就是接口的【常量】。
格式：
public static final 数据类型 常量名称 = 数据值;
备注：
一旦使用final关键字进行修饰，说明不可改变。

注意事项：
1. 接口当中的常量，可以省略public static final，注意：不写也照样是这样。
2. 接口当中的常量，必须进行赋值；不能不赋值。
3. 接口中常量的名称，使用完全大写的字母，用下划线进行分隔。（推荐命名规则）
 */
public class Main1 {

    public static void main(String[] args) {
        // 错误写法！不能直接new接口对象使用。
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        OneImplementClass impl = new OneImplementClass();
        impl.methodAbs1();
        impl.methodAbs2();

        impl.methodDefault1();
        impl.methodDefault2();

        Interface1.methodStatic1();
        Interface1.methodStatic2();

        System.out.println(Interface1.NUM);
    }

}
