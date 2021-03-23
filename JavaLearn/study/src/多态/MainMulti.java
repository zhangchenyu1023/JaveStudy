package 多态;

/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者：
接口名称 对象名 = new 实现类名称();

访问成员变量的两种方式：
1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。

成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。
 */
public class MainMulti {

    public static void main(String[] args) {
        int num=10;
        Fu obj = new Zi();

        obj.method(); // 父子都有，优先用子
        obj.methodFu(); // 子类没有，父类有，向上找到父类
//        obj.methodZi(); // 错误写法！

        System.out.println(obj.num); // 父：10
//        System.out.println(obj.age); // 错误写法！

        // 子类没有覆盖重写，就是父：10
        // 子类如果覆盖重写，就是子：20
        obj.showNum();

    }
}
