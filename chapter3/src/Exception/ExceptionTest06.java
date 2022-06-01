package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description: 处理异常的第一种方式：在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁
 * @User:
 * @Date:
 */
public class ExceptionTest06 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正的发生了，一定会抛给JVM，JVM只有终止
    //异常处理机制的作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。所以
    //一般main方法中的异常建议使用try..catch进行捕捉，main就不要继续上抛了
    public static void main(String[] args) {

        //100 / 0是算数异常，这个异常是运行时异常，你在编译阶段，可以处理，也可以不处理，编译器不管
        //System.out.println(100 / 0);//不处理编译器不管
        //你处理也可以

        System.out.println("maim begin");
        try {
            //try尝试
            m1();
            //以上代码出现异常，直接进入catch语句块中执行。
            System.out.println("Hewllo World!");
        } catch (FileNotFoundException e) {//catch后面的方法是一个方法的形参
            //这个分支中可以使用e引用，e引用保存的内存地址是那个new出来的异常对象的内存地址。
            //catch是捕捉异常之后走的分支。
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
        }
        System.out.println("main over");
    }

    private static void m1() throws FileNotFoundException{
        System.out.println("m1 begin");
        m2();
        //以上代码出异常，这里是无法执行的。
        System.out.println("m1 over");
    }
    //抛别的不行，抛ClassCastException说明你还是对FileNotFoundException进行处理
    //private static void m2() throws ClassCastException{
    //FileNotFoundException的父对象IOException，这样是可以的，因为IOException包括FileNotFoundException
    //private static void m2() throws IOException {
    //private static void m2() throws Exception {
    //throws后面也可以写多个异常，可以使用逗号隔开。
    //private static void m2() throws ClassCastException,Exception {
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        //编译器报错原因是：m3()方法声明位置上有：throws FileFoundException
        //我们在这里调用m3()没有对异常进行预处理，所以编译报错
        //m3();

        m3();
        //以上如果出现异常，这里无法执行！
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException{
        //调用SUN jdk中某个类的构造方法。
        //这个类还没有接触国，后期IO刘就知道了
        //我们只是借助这个类学习一下异常处理机制
        //创建一个输入流对象，该流指向一个文件
        /*
        编译报错的原因是什么？
            第一：这里调用了一个构造方法：FileInputStream(String name)
            第二：这个构造方法的声明位置上有：throws FileNotFoundException
            第三：通过类的继承结构看到：FileNotFoundException父类是IOException，IOException的父类是Exception。
            最终得知，FileNotFoundException是编译时异常。
            错误原因？编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器报错。
         */

        //我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛。
        //一个方法当中的代码出现异常之后，如果上报的话，此方法结束。
        new FileInputStream("Image/battleship.png");

        System.out.println("如果以上代码出异常，这里也不会执行！");
    }
}
