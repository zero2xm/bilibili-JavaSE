package inner;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class Test01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        /*mm.mySum(new Compute(){
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },100,200);*/
        mm.mySum(new ComputeImpl(),200,300);
    }
}
