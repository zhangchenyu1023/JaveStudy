package InnerClass.chengyuanneibulei;

/*
 成员内部类的定义格式：
 修饰符 class 外部类名称 {
     修饰符 class 内部类名称 {
     // ...
     }
 // ...
 }
 注意：内用外，随意访问；外用内，需要内部类对象。
 如何使用成员内部类？有两种方式：
 1. 间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
 2. 直接方式，公式：
 【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 */
public class Body {

    // 外部类的成员变量
    private String name;

    public class Heart { // 成员内部类
        public void beat() {
            System.out.println("心脏跳动：蹦蹦蹦！");
            System.out.println("我叫：" + name); // 正确写法！
        }

    }

    // 外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        Heart heart=new Heart(); // 间接方式：在外部类的方法当中，使用内部类
        heart.beat();
        // 或隐式对象方式
        new Heart().beat();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
