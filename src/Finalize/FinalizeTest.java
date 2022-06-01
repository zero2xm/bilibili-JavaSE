package Finalize;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class FinalizeTest {
    public static void main(String[] args) {
        //创建对象
        Person p = new Person();
        //把Person对象变成垃圾？
        p = null;
    }
}
