package Array;

/**
 * @Description:动态初始化方式：
 * @User:
 * @Date:
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //声明/定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];//创建长度为4的int数组，数组中每个元素的默认值是0。
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println("数组中下标为" + i + "的元素是：" + a[i]);
        }

        //后期赋值
        a[0] = 1;
        a[1] = 100;
        a[2] = 111;
        a[3] = 222;//注意下标别越界。


        //初始化一个Object类型的数组，采用动态初始化方式
        Object[] objs = new Object[3];//3个长度，动态初始化，所以每个元素默认值是null。
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }

        String[] strs = new String[3];
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        //采用静态初始化的方式
        String[] strs2 = {"abc","def","xyz"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs2[i]);
        }

        //存储Object，采用静态初始化呢？
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        Object[] objects = {o1,o2,o3};

        for (int i = 0; i < objects.length; i++) {
            /* Object o =objects[i];
            System.out.println(o); */
            System.out.println(objects[i]);//java.lang.Object@......
        }
    }
}
