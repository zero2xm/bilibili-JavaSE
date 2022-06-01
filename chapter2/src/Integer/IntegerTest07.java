package Integer;

/**
 * @Description: Integer类中有哪些常用的方法
 * @User:
 * @Date:
 */
public class IntegerTest07 {
    public static void main(String[] args) {
        //手动装箱
        //Integer x = new Integer(1000);

        //手动拆箱
        //int y = x.intValue();
        //System.out.println(y);

        //Integer a = new Integer("123");

        //编译的时候没问题，一切符合java语法，运行时会不会出问题？
        //不是一个"数字"可以包装成Integer吗？不能，运行时出现异常
        //Integer a = new Integer("中文");//数字格式化异常：NumberFormatException

        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");//String - 转换 -> int
        System.out.println(retValue + 100);//223
        //Integer a = new Integer("中文");//数字格式化异常：NumberFormatException

        //照葫芦画瓢
        double retValue2 = Double.parseDouble("3.14");
        System.out.println(retValue2 + 1);//4.140000000000001(精度问题)

        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3 + 1);//2.0


        //static String toBinaryString(int i)
        //静态的：将十进制转换成二进制字符串。
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);//"11"二进制字符串

        //static String toHexString(int i)
        //静态的：将十进制转换成十六进制字符串。
        String hexString = Integer.toHexString(16);
        System.out.println(hexString);//"10"十六进制字符串

        //十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        hexString = Integer.toHexString(17);
        System.out.println(hexString);//"11"

        //static String toOctalString(int i)
        //静态的：将十进制转换成八进制字符串
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);

        //valueOf方法作为了解
        //static Integer valueOf(int i)
        //静态的：int -- > Integer
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        //static Integer valueOf(String s)
        //静态的：String -- Integer
        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

        int i = 110;
        String s = i + "";
        String s2 = String.valueOf(i);

        System.out.println(s2);
    }
}
