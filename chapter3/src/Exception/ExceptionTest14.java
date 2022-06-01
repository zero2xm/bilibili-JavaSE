package Exception;

/**
 * @Description: final finally finalize有什么区别
 * @User:
 * @Date:
 */
public class ExceptionTest14 {
    public static void main(String[] args) {
        //final是一个关键字。表示最终的，不变的。
        final int i = 100;
        //int i 200;

        //finally也是一个关键字，和try联合使用，使用在异常处理机制中
        //在finally语句块中的代码是一定会执行的
        try {

        }finally {
            System.out.println("finally...");
        }

        //finalize()是Object类中的一个方法，作为方法名出现。
        //所以finalize是标识符。
        //finalize()方法是JVM的GC垃圾回收器负责调用。
        Object obj;
    }
}
