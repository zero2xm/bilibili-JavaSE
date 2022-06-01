package exam3;

/**
 * @Description:
 *
 * 面试题:doOther方法执行的时候需要等待doSome结束吗？
 *      不需要，因为MyClass对象是两个，两把锁。
 *
 * @User:
 * @Date:
 */
public class Exam03 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();

        Thread t1 = new MyThread(mc1);
        Thread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(500);//这个睡眠的作用是：为了保证t1线程先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread {
    private MyClass mc;
    public MyThread(MyClass mc){
        this.mc = mc;
    }
    public void run(){
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }
}

class MyClass {
    //synchronized出现在实例方法上，表示锁this。
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}