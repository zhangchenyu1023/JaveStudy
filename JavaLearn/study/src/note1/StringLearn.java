package note1;

/**
 * @author solang
 * @date 2021-03-20 15:29
 */
public class StringLearn {
    public static void main(String[] args) {
//        1.创建空字符串
        String a=new String();
//        2.根据字符串数组创建
        char[] chararray=new char[]{'d','d','d'};
        String b=new String(chararray);
//        3.根据字节数组创建
        byte[] bytearray=new byte[]{48,65,97};
        String c=new String(bytearray);

//        4.直接创建
        String d="dfdsf";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

//        == 比较地址值
//        .equals() 比较内容
//        .equalsIgnoreCase() 忽略大小写
//        .length()
//        .concat() 拼接
//        .charAt() 返回索引位置的单个字符char
//        .indexOf() 返回字符串第一次出现的位置int -1

//        .substring(int index) 截取字符串
//        .substring(int begin,int end) [begin,end)

//        .toCharArray() 将字符串拆分成字符数组
//        .getBytes() 将字符串拆分成字节数组
//        .replace(String oldstr,String newstr) 用新字符串替代老字符串

//        .split(String str) 用字符串切割，返回字符串数组
    }
}
