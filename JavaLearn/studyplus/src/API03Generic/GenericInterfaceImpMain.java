package API03Generic;

/**
 * @author zhangchenyu
 * @date 2021-03-24 10:09
 */
public class GenericInterfaceImpMain {
    public static void main(String[] args) {
        // 方法一
        GenericInterfaceImp01 gc1= new GenericInterfaceImp01();
        gc1.method("dfsdf");

        // 方法二
        GenericInterfaceImp02 <Integer> gc2=new GenericInterfaceImp02<>();
        gc2.method(10);

        GenericInterfaceImp02 <Double> gc3=new GenericInterfaceImp02<>();
        gc3.method(10.1);

        GenericInterfaceImp02 <String> gc4=new GenericInterfaceImp02<>();
        gc4.method("dfdsf");
    }

}
