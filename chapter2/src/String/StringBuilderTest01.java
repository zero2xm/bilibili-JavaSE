package String;

/**
 * @Description: String
 * @User:
 * @Date:
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //扩容次数越少 效率越高
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append(true);
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb);
    }
}
