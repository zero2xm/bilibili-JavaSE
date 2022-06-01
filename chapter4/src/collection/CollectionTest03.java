package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c1 = new ArrayList();
        //添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);

        //迭代集合
        Iterator it = c1.iterator();
        while (it.hasNext()){
            //存进去什么类型，取出来还是什么类型。
            Object obj = it.next();
            /*if (obj instanceof Integer){
                System.out.println("Integer类型");
            }*/
            //只不过在输出的时候转换成字符串，因为这里println会调用toString()方法。
            System.out.println(obj);
        }

        //HashSet集合：无序不可重复
        Collection c2 = new HashSet();
        //无序：存进去和取出的顺序不一定相同。
        //不可重复：存储100，不能再存储100。
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(100);
        Iterator ti2 = c2.iterator();
        while (ti2.hasNext()){
            System.out.println(ti2.next());
        }
    }
}
