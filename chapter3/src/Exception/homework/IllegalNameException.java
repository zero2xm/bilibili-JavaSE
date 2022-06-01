package Exception.homework;

/**
 * @Description: 自定义异常
 * @User:
 * @Date:
 */
public class IllegalNameException extends Exception {
    public IllegalNameException() {

    }

    public IllegalNameException(String s) {
        super(s);
    }
}
