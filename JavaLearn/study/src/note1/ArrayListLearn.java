package note1;

import java.util.ArrayList;

/*
三个常用方法：
1 .add()
2 .add(n,)
3 .remove(n)
4 .get(n)

如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add(0,"zhang san");
        list.add(1,"li si");
        list.add("wang wu");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int num=list.size();
        System.out.println(num);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);
    }
}
