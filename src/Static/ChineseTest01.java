package Static;

import java.math.BigDecimal;

public class ChineseTest01 {
    public static void main(String[] args) {

        //创建中国人对象1
        ChineseTest zs = new ChineseTest("1","zs");
        System.out.println(zs.id+","+zs.name+","+ChineseTest.country);

        //创建中国对象2
        ChineseTest ls = new ChineseTest("2","ls");
        System.out.println(ls.id+","+ls.name+","+ChineseTest.country);

        //所有静态的数据都是可以采用类名.，也可以采用引用.,但是建议采用类名.的方式访问。
        //采用引用.的方式访问的时候，即使引用null，也不会出现空指针异常。因为访问静态的数据不需要对象的存在
        System.out.println(zs.country);

    }
}
