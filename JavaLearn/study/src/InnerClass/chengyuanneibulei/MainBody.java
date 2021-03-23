package InnerClass.chengyuanneibulei;

/**
 * @author zhangchenyu
 * @date 2021-03-22 12:52
 */
public class MainBody {
    public static void main(String[] args) {
        // 间接方式：通过外部类的对象，调用外部类的方法，里面间接在使用内部类Heart
        Body body = new Body(); // 外部类的对象
        body.methodBody();

        System.out.println("=====================");

        // 直接方式：外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
