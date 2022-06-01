package Array;

/**
 * @Description: 二维数组的遍历
 * @User:
 * @Date:
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        //二维数组
        String[][] array = {{"java","oracle","C++","python","c#"},{"z3","l4","w5"},{"lucy","jack","rose"}};
        
        //遍历二维数组
        for (int i = 0; i < array.length; i++) {//外层循环3次
            String[] a1 = array[i];
            //负责遍历一维数组
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j] + " ");
            }
            //输出换行符
            System.out.println();
        }

        //合并代码
        for (int i = 0; i < array.length; i++) {//外层循环3次
            //负责遍历一维数组
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            //输出换行符
            System.out.println();
        }
    }
}
