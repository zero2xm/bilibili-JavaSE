package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Description:
 *
 * 反正Student类当中所有的Field
 *
 * @User:
 * @Date:
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class studentClass = Class.forName("bean.Student");

        String className = studentClass.getName();
        System.out.println("完整类名" + className);

        String simpleName = studentClass.getSimpleName();
        System.out.println("简类名" + simpleName);

        //获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);//测试数组中只有一个元素
        //取出这个Field
        Field f = fields[0];
        //取出这个Field它的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);

        //遍历
        for (Field field : fs) {
            System.out.println("===============");
            //获取属性的修饰符列表
            int i = field.getModifiers();//返回的修饰符是一个数字，每个数字是修饰符的代号
            System.out.println(i);
            //将"代号"转换成字符串
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            //获取属性的类型和名字
            Class fieldType = field.getType();
            //String fName = fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.println(fName + " " + field.getName());
            //System.out.println(field.getType() + " " + field.getName());
        }
    }
}
