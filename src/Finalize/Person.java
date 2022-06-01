package Finalize;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class Person {
    //重写finalize()方法
    //Person类型的对象被垃圾回收器回收的时候，垃圾回收器负责调用：p.finalize();
    protected  void finalize() throws Throwable{
        System.out.println("即将被销毁！");
    }
}
