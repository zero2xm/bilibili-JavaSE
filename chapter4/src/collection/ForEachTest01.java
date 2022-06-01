package collection;

/**
 * @Description: JDK5.0之后推出了一个新特性：叫做增强for循环，或者叫foreach
 * @User:
 * @Date:
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        //int类型数组
        int[] arr = {432,4,65,46,54,76,54};

        //遍历数组
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //增强for(foreach)
        //foreach有一个缺点：没有下标。在需要使用下标的循环中，不建议使用增强for循环。
        for (int data : arr) {
            //data就是数组中的元素(数组中的每一个元素)
            System.out.println(data);
        }
    }
}
