package thread;

/**
 * @Description:
 *
 * sleep睡眠太久了，如果希望半道上醒来，你应该怎么办？也就是说怎么叫醒一个正在睡眠的线程？
 *      注意:这个不是中断线程的执行，是终止线程的睡眠。
 *
 * @User:
 * @Date:
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //希望5秒之后，t线程醒来(5秒之后主线程手里的活儿干完了)
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t线程的睡眠(这种中断睡眠的方式依靠了java的异常处理机制)
        t.interrupt();//干扰 一碰冷水过去！
    }
}

class MyRunnable2 implements Runnable {

    //重点:run()方法当中的异常不能throws，只能try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> begin");
        try {
            //睡眠一年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            //打印异常信息
            //e.printStackTrace();
        }
        //1年之后才会执行这里
        System.out.println(Thread.currentThread().getName() + "---> end");

        //调用doOther
        //doOther();必须try catch
    }

    //其它方法可以throws
    public void doOther() throws Exception{

    }
}
