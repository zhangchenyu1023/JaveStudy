package RedPaketProject2;

import java.util.ArrayList;

public interface OpenMode {
    /**
     * 请将totalMoney分成count份，保存到ArrayList<API01.Integer>中，返回即可。
     *
     * @param totalMoney            总金额为方便计算，已经转换为整数，单位为分。
     * @param totalCount            红包个数
     * @return ArrayList<API01.Integer>	元素为各个红包的金额值，所有元素的值累和等于总金额。
     */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}