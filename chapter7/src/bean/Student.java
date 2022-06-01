package bean;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Student {
    //Field翻译为字段，其实就是属性/成员
    //4个Field，分别采用了不同的访问控制权限修饰符
    public int no;
    private String name;
    protected int age;
    boolean sex;
    public static final double MATH_PI = 3.1415926;
}
