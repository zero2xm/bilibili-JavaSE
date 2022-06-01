package Exception;

/**
 * @Description: java语言中异常是以什么形式存在的呢？
 *                  1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象。
 *                  2、
 * @User:
 * @Date:
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过"异常类"实例化"异常对象"
        NumberFormatException nfe = new NumberFormatException("数字格式化！");

        //java.langa.NumberFormatException:数字格式化异常！
        System.out.println(nfe);

        //通过"异常类"实例化"异常对象"
        NullPointerException npe = new NullPointerException("空指针异常发生了！");

        //java.lang.NullPointerException: 空指针异常发生了！
        System.out.println(npe);
    }
}
