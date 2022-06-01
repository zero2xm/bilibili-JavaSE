package collection;

import java.util.TreeSet;

/**
 * @Description:
 * 1、TreeSet集合底层实际上是一饿TreeMap
 * 2、TreeMap集合底层是一个二叉树
 * @User:
 * @Date:
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("zs");
        ts.add("ls");
        ts.add("ww");
        ts.add("zl");
        ts.add("wl");
        //遍历
        for (String s :
                ts) {
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(10);
        for (Integer elt : ts2) {
            System.out.println(ts2);
        }
    }
}
