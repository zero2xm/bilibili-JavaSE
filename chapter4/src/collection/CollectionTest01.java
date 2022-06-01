package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();//接口是抽象的，无法实例化。
        //多态
        Collection c = new ArrayList();
        //测试Collection接口中的常用方法
        c.add(1200);//自动装箱(java5新特性)，实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);//自动装箱
        c.add(new Object());
        c.add(true);//自动装箱

        //获取集合中元素的个数
        System.out.println("集合中元素个数是：" + c.size());//4

        //清空集合
        c.clear();
        System.out.println("集合中元素个数是：" + c.size());//0

        //再向集合中添加元素
        c.add("hello");//"hello"对象的内存地址放到了集合当中。
        c.add("world");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1);

        //判断集合中是否包含"绿巨人"
        boolean flag = c.contains("绿巨人");
        System.out.println(flag);//true
        boolean flag2 = c.contains("绿巨人2");
        System.out.println(flag2);//false
        System.out.println(c.contains(1));//true

        System.out.println("集合中元素个数是：" + c.size());//5

        //删除集合中某个元素
        c.remove(1);
        System.out.println("集合中元素个数是：" + c.size());//4

        //判断集合是否为空(集合中是否存在元素)
        System.out.println(c.isEmpty());//false
        //清空
        c.clear();
        System.out.println(c.isEmpty());//true(true表示集合中没有元素了)

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("hellowrold!");

        //转换成数组
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            //遍历数组
            Object o = objs[i];
            System.out.println(o);
        }
    }
}
