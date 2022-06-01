package Array;

import java.util.Arrays;

/**
 * @Description: 使用一下SUN公司提供的数组工具类：java.util.Arrays;
 * @User:
 * @Date:
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {112,3,4,56,67,1};
        //工具类当中都是静态的。
        Arrays.sort(arr);

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
