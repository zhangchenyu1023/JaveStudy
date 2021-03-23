package 抽象类和抽象方法;

// 子类也是一个抽象类
public abstract class Dog1 extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
