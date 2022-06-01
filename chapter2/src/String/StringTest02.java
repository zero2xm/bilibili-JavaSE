package String;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class StringTest02 {
    public static void main(String[] args) {
        //"hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建。（因为这个推向已经存在了！）
        String s1 = "hello";
        String s2 = "hello";
        // == 双等号比较的是不是变量中保存的内存地址？是的
        System.out.println(s1 == s2);

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x == y);//false

        //通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用"=="
        //"=="不保险，应该调用String类的equals方法。
        //String类已经重写了equals方法，以下的equals方法调用的String重写之后的equals方法。
        System.out.println(x.equals(y));//true

        String k = new String("testString");
        //"testString"这个字符串可以后面加"."呢？
        //因为"testString"是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("testString".equals(k));//建议使用这种方式，因为这个可以避免空指针异常
        System.out.println(k.equals("testString"));//存在空指针异常的风险，不建议这样写。

        //i变量中保存的是100这个值
        int i = 100;
        //s变量中保存的是字符串对象的内存地址。
        //s引用中保存的不是"abc"，是0x1111
        //而0x1111是"abc"字符串对象在"字符串常量池"当中保存的内存地址。
        String s = "abc";
    }
}
