package API08Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangchenyu
 * @date 2021-03-24 11:15
 */
public class TryCatchFinallyDemo {
    public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat st=new SimpleDateFormat("yy-MM-dd");
//        Date date= null;
        try {
            Date date = st.parse("2021-0101");
            System.out.println(date);
        } catch (ParseException e) {

/* Throwable类中定义了一些查看方法:
    public String getMessage()`:获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
    public String toString()`:获取异常的类型和异常描述信息(不用)。
    public void printStackTrace()`:打印异常的跟踪栈信息并输出到控制台,在开发和调试阶段,都得使用printStackTrace。*/
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("无论是否出现异常都会执行");
        }
        System.out.println("运行后续代码");
    }
}
