package IOTest;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class logTest {
    public static void main(String[] args) {
        //测试工具类是否好用
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");
        Logger.log("调用了UserService的doSome()方法");
        Logger.log("用户尝试进行登陆，验证失败");
        Logger.log("我非常喜欢这个记录日志的工具哦！");
    }
}
