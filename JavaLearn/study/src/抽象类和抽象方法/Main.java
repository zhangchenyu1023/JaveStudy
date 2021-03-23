package 抽象类和抽象方法;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误！

//        Dog dog = new Dog(); // 错误，这也是抽象类

        Dog2_1 golden = new Dog2_1();
        golden.eat();
        golden.sleep();

        System.out.println("==========");
        Dog2_2 ha = new Dog2_2(); // 这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();

    }


}
