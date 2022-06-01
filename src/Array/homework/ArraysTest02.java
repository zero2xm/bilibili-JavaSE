package Array.homework;

import java.util.Arrays;

/**
 * @Description:    SUN公司已经为我们程序员写好了一个数组工具类
 *                  Java.util.Arrays;
 * @User:
 * @Date:
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        int[] arr = {3,6,4,5,12,1,2,32,5,5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int index = Arrays.binarySearch(arr,32);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是：" + index);
    }
}
