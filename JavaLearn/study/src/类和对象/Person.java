package 类和对象;

/**
 * @author solang
 * @date 2021-03-20 14:34
 */
public class Person {
    private String name;
    private int old;
    private boolean male;
    static String city;

    static {
        System.out.println("静态代码块只执行一次！静态的优先于其它");
    }
    public Person() {
        System.out.println("构造方法执行");
    }

    public Person(String name, int old, boolean male) {
        this.name = name;
        this.old = old;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Person.city = city;
    }
}
