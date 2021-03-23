package DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*  DateFormat类是一个抽象类,无法直接创建对象使用,可以使用DateFormat类的子类SimpleDateFormat类

    构造方法:
        SimpleDateFormat(String pattern)
        参数:
             String pattern:传递指定的模式
        模式:区分大小写的
            y   年
            M   月
            d   日
            H   时
            m   分
            s   秒
        写对应的模式,会把模式替换为对应的日期和时间
            "yyyy-MM-dd HH:mm:ss"
            "yyyy年MM月dd日 HH时mm分ss秒"
 */
public class DemoDateFormat {
    public static void main(String[] args) throws ParseException {
        // format方法 按照指定的模式,把Date日期,格式化为符合模式的字符串
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)

        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);//Tue Mar 23 19:56:15 CST 2021
        System.out.println(d);//2021年03月23日 19时56分15秒

        System.out.println("======================");
        // parse方法 把符合模式的字符串,解析为Date日期
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期

        Date date2 = sdf2.parse("2088年08月08日 15时51分54秒");
        System.out.println(date);
    }
}
