package API09Thread.Method02;

/**
 * @author zhangchenyu
 * @date 2021-03-24 19:22
 */
public class RunnableImp implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread:"+i);
        }
    }
}
