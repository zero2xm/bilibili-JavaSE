package Method;
/*
        方法调用:
            1、方法的修饰符列表当中有static关键字，完整的调用方式是:类名.方法名(实参列表);

            2、但是，有的时候"类名."可以参略，什么情况下可以省略呢
                m1(){
                    m2();
                }
                m1方法和m2方法在同一个类体当中的时候，"类名."可以省略不写

            3、建议在一个java源文件当中只定义一个class，比较清晰。

 */

public class Method04 {
    public static void main(String[] args) {

        //调用方法
        Method04.m();

        //对于方法的修饰符列表当中有static关键字的："类名"可以省略不写吗
        m();

        A.doOther();

        //省略"类名."试试
        //编译报错，"类名."省略之后，默认从当前类中找"doOther"方法，在当前类中该方法不存在。
//        doOther();

        //省略的方式
        m2();

        //不想调用当前本类当中的m2方法，这个时候必须添加"类名."。
        A.m2();

    }
    public static void m(){
        System.out.println("m method execute!");
    }
    public static void m2(){
        System.out.println("m2 execute!");
    }
}
class A{
    public static void doOther(){
        System.out.println("A's doOther method invoke!");
    }
    public static void m2(){
        System.out.println("A's m2 method execute!");
    }
}