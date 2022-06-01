package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: 深入tyr..catch
 * @User:
 * @Date:
 */
public class ExceptionTest07 {
    public static void main(String[] args) {

        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("Image/battleship.png");

            //进行数学运算
            System.out.println(100 / 0);
            //System.out.println("以上出现异常，这里无法执行！");
            //JDK8新特性
        } catch (FileNotFoundException | ArithmeticException e) {//多态：IOException e = new FileNotFoundException
            System.out.println("文件不存在！");
        }
    }
}
