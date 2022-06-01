package Exception;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            //退出jVM
            System.exit(0);//退出JVM之后，finally语句中的代码就不执行了
        }finally {
            System.out.println("finally...");
        }
    }
}
