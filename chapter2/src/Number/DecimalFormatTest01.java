package Number;

import java.text.DecimalFormat;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //java.text.DecimalFormat专门负责数字格式化的。
        //DecimalFormat df = new DecimalFormat("数字格式");

        /*
        数字格式有哪些？
         # 代表任意数字
         , 代表千分位
         . 代表小数点
         0 代表不够时补0

         ###,###.##
            表示：加入千分位，保留两个小数。
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(111234.561234);
        System.out.println(s);//111234.56

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(1234.56);
        System.out.println(s2);//1,234,5600
    }
}
