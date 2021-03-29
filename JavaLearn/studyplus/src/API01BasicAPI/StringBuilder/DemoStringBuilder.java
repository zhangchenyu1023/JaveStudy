package API01BasicAPI.StringBuilder;
/*
    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        API01.StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        API01.StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
    常用方法:
        public API01.StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);//bu1:""

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);//bu2:abc

        StringBuilder bu3 = bu1.append("abc");
        System.out.println("bu3:"+bu3);

        bu1.append("123");
        System.out.println("bu1:"+bu1);

/*
    StringBuilder和String可以相互转换:
        String->API01.StringBuilder:可以使用StringBuilder的构造方法
            API01.StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        API01.StringBuilder->String:可以使用StringBuilder中的toString方法
            public String toString()：将当前StringBuilder对象转换为String对象。
*/
        //String->API01.StringBuilder
        String str = "hello";
        StringBuilder bu = new StringBuilder(str);
        System.out.println("bu:"+bu);

        //API01.StringBuilder->String
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
