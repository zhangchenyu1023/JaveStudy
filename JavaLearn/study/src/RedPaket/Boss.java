package RedPaket;

import java.util.ArrayList;

/**
 * @author solang
 * @date 2021-03-20 20:54
 */
public class Boss extends User{
    public Boss() {
    }

    public Boss(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int sendmoney,int num){
        ArrayList<Integer> list=new ArrayList<>();
        int leftmoney=super.getMoney();
        if (sendmoney>leftmoney){
            System.out.println("余额不足");
            return list;
        }else {
            int avg=sendmoney/num;
            int last=sendmoney%num;
            for (int i = 0; i < num-1; i++) {
                list.add(avg);
            }
            list.add(avg+last);
            super.setMoney(leftmoney-sendmoney);
            return list;
        }
    }
}

