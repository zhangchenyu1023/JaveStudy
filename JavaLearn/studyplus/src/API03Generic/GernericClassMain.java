package API03Generic;

/**
 * @author zhangchenyu
 * @date 2021-03-24 9:46
 */
public class GernericClassMain {
    public static void main(String[] args) {
        GenericClass <String> gc =new GenericClass<>("zhangsan");
        System.out.println(gc.getName());

        gc.method(10);
        gc.method("ddfdsf");
        gc.method('d');
    }
}
