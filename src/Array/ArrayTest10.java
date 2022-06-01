package Array;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {{34,4,65},{100,200,3900,11},{0}};

        //请取出以上二维数组的第一个一维数组。
        int[] a0 = a[0];

        //合并以上代码
        System.out.println(a[0][0]);

        //取出第二个一维数组当中的第三个元素
        System.out.println("第二个一维数组中第三个元素" + a[1][2]);

        //取出第三个一维数组当中第三个元素
        System.out.println(a[2][2]);

        //改
        a[2][0] = 11111;
        System.out.println(a[2][0]);
    }
}
