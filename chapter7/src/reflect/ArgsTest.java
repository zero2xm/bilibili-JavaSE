package reflect;

/**
 * @Description:
 *
 * 可变长度参数
 *      int... args 这就是可变长度参数
 *      语法是:类型...(注意:一定是3个点...)
 *
 *      1、可变长度参数要求的参数个数是:0~N个。
 *      2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有1个。
 *      3、可变长度参数可以当做一个数组来看待
 * @User:
 * @Date:
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        m(10,10,10,10,10,20);

        m2(100);
        m2(200,"abc");
        m2(200,"abc","def");
        m2(200,"abc","def","xyz");

        m3("ab","de","kk","ff");

        String[] strs = {"a","b","c"};
        m3(strs);

        m3(new String[]{"我","是","中","国","人"});//没必要
        m3("我","是","中","国","人");
    }

    public static void m(int... args){
        System.out.println("m方法执行了！");
    }

    //public static void m2(int...args2,String...args){}

    //必须在最后，只能有1个
    public static void m2(int a,String... args){}

    public static void m3(String... args){
        //args有length属性，说明args是一个数组
        //可以将可变长度参数当作一个数组来看。
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
