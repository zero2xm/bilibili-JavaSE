package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"zs");
        map.put(6666,"ls");
        map.put(7777,"ww");
        map.put(2222,"zl");
        map.put(2222,"king");//key重复的时候value会自动覆盖。

        System.out.println(map.size());//4

        //遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry :
                set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
