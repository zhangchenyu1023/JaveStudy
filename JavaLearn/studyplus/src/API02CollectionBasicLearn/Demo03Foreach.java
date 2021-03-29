package API02CollectionBasicLearn;

import java.util.ArrayList;

/*
    增强for循环:用来遍历集合和数组

    格式:
        for(集合/数组的数据类型 变量名: 集合名/数组名){
            sout(变量名);
        }
 */
public class Demo03Foreach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s : list){
            System.out.println(s);
        }
    }
}
