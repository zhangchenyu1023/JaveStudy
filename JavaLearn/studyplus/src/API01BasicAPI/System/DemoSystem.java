package API01BasicAPI.System;

import java.util.Arrays;

/*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
        public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
        public static void arraycopy(s.API01.Object src, int srcPos, s.API01.Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。

        public static void arraycopy(s.API01.Object src, int srcPos, s.API01.Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
        参数:
            src - 源数组。
            srcPos - 源数组中的起始位置(起始索引)。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
 */
public class DemoSystem {
    public static void main(String[] args) {
        long e = System.currentTimeMillis();
        System.out.println(e);

        //定义源数组
        int[] src = {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前dest:" + Arrays.toString(dest));

        //使用System类中的arraycopy把源数组的前3个元素复制到目标数组的前3个位置上
        System.arraycopy(src, 0, dest, 0, 3);

        System.out.println("复制后dest:" + Arrays.toString(dest));


    }
}

