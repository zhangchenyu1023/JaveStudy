package Reflect;

/**
 * @author zhangchenyu
 * @date 2021-03-25 9:24
 */
public class Person {
    public int a;
    public int b;
    protected int c;
    int d;
    private String name;
    private int old;

    public Person() {
    }
    public Person(String name, int old) {
        this.name = name;
        this.old = old;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }

    public void eat(){
        System.out.println("eat...");
    }
}
