package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: 异常对象的两个方法:
 *                  String msg = e.getMessage();
 *                  e.printStackTrace();
 * @User:
 * @Date:
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            //获取异常的简单描述信息
            String msg = e.getMessage();
            System.out.println(msg);
            //打印异常堆栈追踪信息！！
            //在实际的开发中，建议使用这个，养成好习惯！
            //这行代码要写上，不然出问题你也不知道！
            e.printStackTrace();
            /*
            java.io.FileNotFoundException: Image/battleship.pn (No such file or directory)
	            at java.base/java.io.FileInputStream.open0(Native Method)
	            at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
	            at Exception.ExceptionTest09.m3(ExceptionTest09.java:46)
	            at Exception.ExceptionTest09.m2(ExceptionTest09.java:42)
	            at Exception.ExceptionTest09.m1(ExceptionTest09.java:38)
	            at Exception.ExceptionTest09.main(ExceptionTest09.java:16)
	            因为46行出问题导致了42行
	            42行出问题导致了38行
	            38行出问题导致了16行
	            应该先查看46行的代码，46行是代码错误的根源。
             */
        }
        //这里程序不耽误执行，很健壮。《服务器不会因为遇到异常而宕机》
        System.out.println("Hello World！");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("Image/battleship.pn");
    }
}
