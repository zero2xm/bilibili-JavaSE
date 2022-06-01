package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description: 关于集合元素的remove
 * @User:
 * @Date:
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        //创建集合
        Collection c = new ArrayList();

        //注意：次数获取的迭代器，指向的是集合中没有元素状态下的迭代器。
        //一定要注意：集合结构只要发生改变，迭代器必须重新获取
        //当集合结构发生了改变，迭代器没有重新获取时，调用next()方法，会出现异常。
        //Iteratro it = c.iterator();

        //添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        //获取迭代器
        /*Iterator it = c.iterator();
        while (it.hasNext()){
            //编写代码时next()方法返回值类型必须是Object
            //Integer i = it.next();
            Object obj = it.next();
            System.out.println(obj);
        }*/

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o = it2.hasNext();
            //删除元素
            //删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是循环下一次的时候并没有重新获取迭代器，所以会出现异常
            //出异常根本原因是：集合中元素删除了，但是没有更新迭代器(迭代器不知道集合变化了)
            //c2.remove(o);//直接通过集合去删除元素，没有通知迭代器。(导致迭代器的快照和原集合不同)
            //迭代器去删除时，会自动更新迭代器，并且更新集合(删除集合中的元素)
            c2.remove(o);
            System.out.println(o);
        }
    }
}
