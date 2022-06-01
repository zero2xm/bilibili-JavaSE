package Random;

import java.util.Random;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class RandomTest01 {
    public static void main(String[] args) {
        //创建随机对象
        Random random = new Random();

        //随机产生一个int类型取值范围内的数字。
        int num1 = random.nextInt();

        System.out.println(num1);

        //产生[0]~100之间的随机数，不能产生101
        //nextInt翻译为：下一个int类型的数据是101，表示只能取到100
        int num2 = random.nextInt(101);
    }
}
