package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description: 深入Colleciton集合的contains方法：
 *
 * @User:
 * @Date:
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //向集合中存储元素
        String s1 = new String("abc");
        c.add(s1);//放进去了一个"abc"

        String s2 = new String("def");
        c.add(s2);

        //集合中元素的个数
        System.out.println("元素的个数是：" + c.size());

        //新建的对象String
        String x = new String("abc");
        //c集合中是否包含x?
        System.out.println(c.contains(x));//true//判断集合中是否存在"abc"
    }
}
