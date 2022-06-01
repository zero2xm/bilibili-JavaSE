package Integer;

/**
 * @Description: 这个题目是Integer非常重要的面试题
 * @User:
 * @Date:
 */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);

        //java中为了提高程序的执行效率，将[-128~127]之间所有的包装对象提前创建好，
        //放到了一个方法区的"整数型常量池"当中了，目的是只要用这个区间的数据不需要再new了，直接从整数型常量池当中取出来。

        //原理：x变量中保存的对象的内存地址和y变量中保存的内存地址是一样的。
        Integer x = 127;
        Integer y = 127;
        // == 永远判断的都是两个对象的内存地址是否相同
        System.out.println(x == y);

        //池：cache,就是缓存机制
        //缓存优点：效率高。
        //缓存缺点：耗费内存。
    }
}
