package 接口;

public interface Interface2 {

    public default void methodDefault() {
        System.out.println("默认方法BBB");
    }
    public default void method(){
        System.out.println("接口2的方法");
    }
    // 这也是抽象方法
    public void methodAbs3();

    // 这也是抽象方法
    void methodAbs4();
}
