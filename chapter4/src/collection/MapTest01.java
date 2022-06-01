package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向Map集合中添加键值对
        map.put(1,"zhangsan");//1在这里进行了自动装箱
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //通过key获取value
        String value = map.get(2);
        System.out.println(value);
        //获取键值对的数量
        System.out.println("键值对的数量：" + map.size());
        //通过key删除key-value
        map.remove(2);
        System.out.println("键值对的数量：" + map.size());
        //判断是否包含某个key
        //contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
        System.out.println(map.containsKey(4));
        //判断是否包含某个value
        System.out.println(map.containsValue("wangwu"));

        //获取所有的value
        Collection<String> values = map.values();
        for (String s :
                values) {
            System.out.println(s);
        }

        //清空map集合
        map.clear();
        System.out.println("键值对的数量：" + map.size());
        //判断是否为空
        map.isEmpty();
    }
}
