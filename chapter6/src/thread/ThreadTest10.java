package thread;

/**
 * @Description:
 *
 * 怎么合理的终止一个线程的执行。这种方式是很常用的。
 *
 * @User:
 * @Date:
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        //模拟五秒
        try {
            t.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        //你想要什么时候终止t的执行，那么你把标记修改为false，就结束了。
        r.run = false;
    }
}

class MyRunnable4 implements Runnable {

    //打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                //return就结束了，你在结束之前还有什么没保存的。
                //在这里可以保存呀。
                //save......

                //终止当前线程
                return;
            }
        }
    }
}