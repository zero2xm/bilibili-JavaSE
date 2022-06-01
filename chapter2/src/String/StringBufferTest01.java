package String;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100; i++) {
            s += i;
            System.out.println(s);
        }
    }
}
