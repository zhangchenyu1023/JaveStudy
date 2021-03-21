package 类和对象;

/**
 * @author solang
 * @date 2021-03-20 17:08
 */
public class Zi extends Fu {
    int num=20;

    public Zi() {
//        super(); // 默认存在该语句
        super(10);
        System.out.println("子类构造方法执行了");
    }

    public void methodZi(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println("子类方法执行了");
    }
}
