package Exception;

/**
 * @Description: SUN提供的JDK内置的异常肯定是不够用的，在实际的开发中，有很多业务，这些业务出现异常之后，JDK中都是没有的
 *
 * @User:
 * @Date:
 */
public class MyException extends Exception{
    public MyException() {
    }
    public MyException(String s){
        super(s);
    }
}
/*
    public class MyException extends RuntimeException{//运行时异常
    }
 */
