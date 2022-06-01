package HashCode;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class HashCode {
    public static void main(String[] args){
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        //对象内存地址经过哈希算法转换的一个数字。
        System.out.println(hashCodeValue);
    }
}
