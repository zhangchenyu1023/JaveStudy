package API10ThreadSafe.Synchronized;

public class RunnableImp implements Runnable{
    private  int ticket = 100;
    Object obj= new Object();
    @Override
    public void run() {
        //使用死循环,让卖票操作重复执行
        while(true){
            synchronized (obj){
            //先判断票是否存在
            if(ticket>0) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
                }
           }
        }
    }
}
