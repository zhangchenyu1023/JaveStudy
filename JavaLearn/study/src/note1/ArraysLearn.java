package note1;

import java.util.Arrays;

/**
 * @author solang
 * @date 2021-03-20 16:36
 */

//    Arrays.toString(array) 将数组转成字符串
//    Arrays.sort(array) 修改原数组为升序
public class ArraysLearn {
    public static void main(String[] args) {
        int[] intarray=new int[]{2,1,3};
        String str1= Arrays.toString(intarray);
        System.out.println(str1);

        Arrays.sort(intarray);
        String str2= Arrays.toString(intarray);
        System.out.println(str2);
    }
}
