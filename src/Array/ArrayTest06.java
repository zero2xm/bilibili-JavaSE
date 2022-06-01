package Array;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class ArrayTest06 {
    //用户名和密码输入到String[] args数组当中。
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用该系统时请输入程序参数，参数中包括用户名和密码信息，例如：zs 123");
            return;
        }

        //程序执行到此出说明用户确实提供了用户名和密码。
        //接下来你应该判断用户名和密码是否正确。
        //取出用户名
        String username = args[0];
        //取出密码
        String password = args[1];

        //假设用户名是admin,密码是123的时候表示登陆成功，其它一律失败。
        //判断两个字符串是否相等，需要使用equals方法。
        //(username.equals("admin") && password.equals("123"))
        //采用以下编码风格，即使username和password都是null，也不会出现空指针异常。
        if ("admin".equals(username) && "123".equals(password)){
            System.out.println("登陆成功，欢迎[" + username + "]回来");
            System.out.println("您可以继续使用该系统....");
        }else{
            System.out.println("验证失败，用户名不存在或密码错误！");
        }
    }
}
