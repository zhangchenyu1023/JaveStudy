package RedPaket;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author solang
 * @date 2021-03-20 21:07
 */
public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void get(ArrayList<Integer> list){
        int leftmoney=super.getMoney();
        int index= new Random().nextInt(list.size());
        int getmoney=list.remove(index);
        super.setMoney(leftmoney+getmoney);
    }
}
