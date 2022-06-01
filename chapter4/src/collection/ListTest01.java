package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description: 测试List接口中常用方法
 * @User:
 * @Date:
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合。
        List myList = new ArrayList();

        //添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");

        //在列表的指定位置插入指定元素(第一个参数是下标)
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低
        myList.add(1,"KING");

        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object elt = it.next();
            System.out.println(elt);
        }

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        //因为有下标，所有List集合有自己比较特殊的遍历方式
        //通过下标遍历。【List集合特有的方式，Set没有】
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("C"));//3

        //获取指定对象以后一次出现处的索引。
        System.out.println(myList.lastIndexOf("C"));//4

        //删除指定下标位置的元素
        //删除下标为0的元素
        myList.remove(0);
        System.out.println(myList.size());//5

        System.out.println("==============================");

        //修改指定位置的元素
        myList.set(2,"Soft");

        //遍历集合
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
