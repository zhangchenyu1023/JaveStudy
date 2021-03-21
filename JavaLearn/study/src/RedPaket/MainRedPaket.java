package RedPaket;

import java.util.ArrayList;

/**
 * @author solang
 * @date 2021-03-20 21:13
 */
public class MainRedPaket {
    public static void main(String[] args) {
        Boss manager = new Boss("群主", 200);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");


        ArrayList<Integer> redList = manager.send(100, 3);

        one.get(redList);
        two.get(redList);
        three.get(redList);

        manager.show();

        one.show();
        two.show();
        three.show();
    }
}
