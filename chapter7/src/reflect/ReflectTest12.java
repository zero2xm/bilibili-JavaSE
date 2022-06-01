package reflect;

import bean.Vip;

import java.lang.reflect.Constructor;

/**
 * @Description:
 *
 * 比(ReflectTest11)重要!
 *
 * 通过反射机制调用构造方法实例化java对象。
 *
 * @User:
 * @Date:
 */
public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        //不实用反射机制怎么创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110,"zhangsan","2001-10-11",true);

        //使用反射机制创建对象
        Class c = Class.forName("bean.Vip");
        //调用无参数构造方法
        Object obj = c.newInstance();
        //调用有参数的构造方法
        //第一步:先获取到有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        //第二步:调用构造方法new对象
        Object newObj =con.newInstance(110,"jackson","1990-19-11",true);
        System.out.println(newObj);

        //获取无参数构造方法
        Constructor con2 = c.getDeclaredConstructor();
        Object newObj2 = con2.newInstance();
        System.out.println(newObj2);
    }
}
