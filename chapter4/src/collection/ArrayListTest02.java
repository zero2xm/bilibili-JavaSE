package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @Description: ArrayList的构造方法
 * @User:
 * @Date:
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        List myList1 = new ArrayList();
        List myList2 = new ArrayList(100);

        //创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        //通过这个构造方法就可以将HashEst集合转换成List集合。
        List myList3 = new ArrayList(c);
        for (int i = 0; i < myList3.size(); i++) {
            System.out.println(myList3.get(i));
        }
    }
}
