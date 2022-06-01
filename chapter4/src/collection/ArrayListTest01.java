package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        //数组的长度是10
        List list1 = new ArrayList();
        System.out.println(list1.size());//0

        //指定初始化容量
        //数组的长度是20
        List list2 = new ArrayList(20);
        //集合的size()方法是获取当前集合中元素的个数，不是获取集合的容量。
        System.out.println(list2.size());//0

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        System.out.println(list1.size());

        //再加一个元素
        list1.add(11);
        System.out.println(list1.size());
        //100 二进制转换成十进制：00000100右移一位00000010 (2)  【4 / 2】
    }
}
