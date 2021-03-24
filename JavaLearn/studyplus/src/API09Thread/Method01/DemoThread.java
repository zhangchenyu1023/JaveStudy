package API09Thread.Method01;

/*
    实现步骤:
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
        3.创建Thread类的子类对象
        4.调用Thread类中的方法start方法,开启新的线程,执行run方法
        多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
    java程序属于抢占式调度,那个线程的优先级高,那个线程优先执行;同一个优先级,随机选择一个执行
 */
public class DemoThread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用Thread类中的方法start方法,开启新的线程,执行run方法
        mt.start();

/*  获取线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
*/
        // 方法1
        System.out.println(mt.getName());

        // 方法2 先用currentThread() 返回对当前正在执行的线程对象的引用，再用getName方法
        Thread t=mt.currentThread();
        System.out.println(t.getName());

        // 方法3
        System.out.println(Thread.currentThread().getName());

    }
}
