package API03Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
/*
        创建集合对象,不使用泛型
        好处:
            集合不使用泛型,默认的类型就是Object类型,可以存储任意类型的数据
        弊端:
            不安全,会引发异常
*/
        ArrayList list1 = new ArrayList();
        list1.add("abc");
        list1.add(1);

        //使用迭代器遍历list集合
        Iterator it1 = list1.iterator();
        while (it1.hasNext()) {
            //取出元素也是Object类型
            Object obj = it1.next();
            System.out.println(obj);
        }

        /*
        创建集合对象,使用泛型
        好处:
            1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
            2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
         弊端:
            泛型是什么类型,只能存储什么类型的数据
     */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
        //list.add(1);//add(java.lang.String)in ArrayList cannot be applied to (int)

        //使用迭代器遍历list集合
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            // 取出的类型是泛型
            String s = it2.next();
            System.out.println(s + "->" + s.length());
        }
    }
}