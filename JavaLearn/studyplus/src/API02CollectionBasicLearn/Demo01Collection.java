package API02CollectionBasicLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
    java.JDBC.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法:
      public boolean add(E e)：  把给定的对象添加到当前集合中 。
      public void clear() :清空集合中所有的元素。
      public boolean remove(E e): 把给定的对象在当前集合中删除。
      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
      public boolean isEmpty(): 判断当前集合是否为空。
      public int size(): 返回集合中元素的个数。
      public Object[] toArray(): 把集合中的元素，存储到Object数组中。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象,可以使用多态
        Collection<String> coll1 = new ArrayList<>();
        Collection<String> coll2 = new HashSet<>();
        System.out.println(coll1);//重写了toString方法  []
        System.out.println(coll2);

    }
}
