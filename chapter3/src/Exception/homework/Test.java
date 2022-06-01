package Exception.homework;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Test {
    public static void main(String[] args) {
        //创建UserService对象
        UserService userService = new UserService();
        try {
            userService.register("李丰豪_Xm","123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
