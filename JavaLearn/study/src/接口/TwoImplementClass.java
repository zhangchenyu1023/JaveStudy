package 接口;

/**
 * @author zhangchenyu
 * @date 2021-03-21 21:41
 */
public class TwoImplementClass extends Fu implements Interface1,Interface2{


    @Override
    public void methodDefault() {
        System.out.println("重写默认方法");
    }

    @Override
    public void methodAbs1() {
        System.out.println("这是1的第一个方法！");
    }

    @Override
    public void methodAbs2() {System.out.println("这是1第二个方法！");

    }

    @Override
    public void methodAbs3() {System.out.println("这是2的第一个方法！");
    }

    @Override
    public void methodAbs4() {System.out.println("这是2的第二个方法！");

    }
}
