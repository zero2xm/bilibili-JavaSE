package Array;

/**
 * @Description:方法上加数组的情况：
 * @User:
 * @Date:
 */
//数组用在方法上
public class ArrayTest03 {
    //main方法的编写方式，还可以采用C++的语法格式
    public static void main(String args[]) {
        System.out.println("hellow world!");
        printArray(new String[3]);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("String数组中的元素：" + args[i]);
        }
    }
}
