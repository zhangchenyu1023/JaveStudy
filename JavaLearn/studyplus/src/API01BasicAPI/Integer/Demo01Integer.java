package API01BasicAPI.Integer;
/*
    装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        构造方法:
            API01.Integer(int value) 构造一个新分配的 API01.Integer 对象，它表示指定的 int 值。
            API01.Integer(String s) 构造一个新分配的 API01.Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
        静态方法:
            static API01.Integer valueOf(int i) 返回一个表示指定的 int 值的 API01.Integer 实例。
            static API01.Integer valueOf(String s) 返回保存指定的 String 的值的 API01.Integer 对象。
    拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 API01.Integer 的值。

    自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
    JDK1.5之后出现的新特性
 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
        //构造方法
        Integer in1 = new Integer(1);//方法上有横线,说明方法过时了
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        //拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        int i = in1.intValue();
        System.out.println(i);
    }
}
