package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Description:
 *
 * 反编译一个类的方法
 *
 * @User:
 * @Date:
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();

        Class userServiceClass = Class.forName("java.lang.String");
        s.append(Modifier.toString(userServiceClass.getModifiers()) + " class " +userServiceClass.getSimpleName() + " {\n ");

        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method : methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            //参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType :
                    parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            //删除指定下标位置上的字符
            s.deleteCharAt(s.length() - 1);
            //s.substring(0,s.length()-1);
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);

    }
}
