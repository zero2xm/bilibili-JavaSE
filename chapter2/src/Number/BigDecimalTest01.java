package Number;

import java.math.BigDecimal;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //这个100不是普通的100，是精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        //精度极高的200
        BigDecimal v2 = new BigDecimal(200);
        //求和
        //v1 + v2;//这样不行，v1和v2是引用，不能直接使用+求和。
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

        BigDecimal v4 = v2.divide(v1);
        System.out.println(v4);

    }
}
