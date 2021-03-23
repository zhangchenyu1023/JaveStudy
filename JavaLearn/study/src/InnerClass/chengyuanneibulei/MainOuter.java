package InnerClass.chengyuanneibulei;

/**
 * @author zhangchenyu
 * @date 2021-03-22 19:06
 */
public class MainOuter {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
