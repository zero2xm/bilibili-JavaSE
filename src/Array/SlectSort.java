package Array;

/**
 * @Description: 选择排序：
 *                  每一次从这堆参与比较的数据当中找出最小值，
 *                  拿着这个最小值和最前面的元素交换位置
 *
 *                  选择排序比冒泡排序：每一次的交换位置都是有意义的
 *
 *                  关键点：选择排序中的关键在于，你怎么找出一堆数据中最小的
 * @User:
 * @Date:
 */
public class SlectSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,5};
        //选择排序
        //5条数据循环4次 （外层循环4次）
        for (int i = 0; i < arr.length - 1; i++) {
            //i正好是"参加比较的这堆数据中"最左边的那个元素的下标
            //i是一个参与比较的这堆数据中的起点下标。
            //假设起点i下标位置上的元素是最小的。
            int m = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[m]){
                    m = j;//最小值的元素下标是j
                }
            }

            //当i和min相等时，表示最初猜测是对的。
            //当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素，需要拿着这个更小的元素和最左边的元素交换位置。
            if (m != i){
                //表示存在更小的数据
                //arr[min]最小的数据
                //arr[i] 最前面的数据
                int temp;
                temp = arr[m];
                arr[m] = arr[i];
                arr[i] =temp;
            }
        }

        //冒泡排序和选择排序实际上比较次数没变
        //交换位置的次数减少了

        //排序之后遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
