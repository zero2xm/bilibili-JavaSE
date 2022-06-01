package Integer;

/**
 * @Description: 这种包装类不用写，SUN公司写好了
 * @User:
 * @Date:
 */
public class MyInt {
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
