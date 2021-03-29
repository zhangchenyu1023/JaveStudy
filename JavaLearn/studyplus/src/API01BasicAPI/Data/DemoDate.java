package API01BasicAPI.Data;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);//Sun Aug 08 12:23:03 CST 2088

        // s.Date(long date) :传递毫秒值,把毫秒值转换为Date日期
        Date date2_1 = new Date(0L);
        System.out.println(date2_1);// Thu Jan 01 08:00:00 CST 1970

        Date date2_2 = new Date(3742767540068L);
        System.out.println(date2_2);// Sun Aug 08 09:39:00 CST 2088

        // getTime()方法返回自 1970 年 1 月 1 日 00:00:00 GMT 以来的毫秒数。
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//3742777636267
    }
}