package IDE;

/**
 * 封装的步骤：
 * 1、所有属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问。
 * 2、对外提供简单的操作入口，也就是说以后外部程序要想访问age属性，必须通过这些简单的入口进行访问
 * - 对外提供两个公开的方法，分别是set方法和get方法
 * - 想修改age属性，调用set方法
 * - 想读取age属性，调用get方法
 * 3、set方法的命名规范：
 * public void set + 属性名首字母大小写(形参){
 * age = a;
 * }
 * 4、get方法命名规范：
 * public int getAge(){
 * return age;
 * }
 * <p>
 * 回想一下，一个属性通常访问的时候包括几种访问形式？
 * - 第一种方式：读取这个属性的值
 * - 第二种方式：想修改这个属性的值，修改set
 * <p>
 * setter and getter方法没有static关键字
 * 有static关键字修饰的方法怎么调用：类名.方法(实参);
 * 没有static关键字修饰的方法怎么调用：引用.方法名(实参);
 */
public class UserTest {
    //属性私有化
    private int age;

    public void setAge(int a) {
        //编写业务逻辑代码进行安全控制
        //age = a;

        if(a<0 || a>150){
            System.out.println("您提供的年龄不合法");
            return;
        }
        //程序可以执行到这里的化，说明a年龄是合法的，则进行赋值运算
        age = a;
    }

    //getter
    public int getAge(){
        return age;
    }
}
