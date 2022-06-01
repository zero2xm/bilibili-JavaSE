package Object;

public class Object02 {
    public static void main(String[] args) {

        //通过一个类可以实例化N个对象
        //实例化对象的语法:new 类名(类名)；
        //new是java语言当中的一个运算符
        //new运算符的作用是创建对象，在JVM堆内存当中开辟新的内存空间
        //方法区内存:在类加载的时候，class字节码代码片段被加载到该内存空间当中。
        //栈内存(局部变量)：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈。
        //堆内存：new的对象在堆内存中存储
        //Object01 是一个引用数据类型
        //s是一个变量名
        //new Object01()是一个学生对象
        //Object01 s;是一个局部变量【在栈内存中存储】
        //什么是对象？new运算符在堆内存中开辟的内存空间称为对象。
        //什么是引用？引用保存了内存地址
        //java语言当中，程序员不能直接操作堆内存，java中没有指针。不像c语言
        //java语言当中，程序员只能通过"引用"去访问堆内存当中对象内部的实例变量。

        Object01 s = new Object01();
        //访问实例变量的语法格式：
        //  读取数据：引用.变量名
        //  修改数据：引用.变量名 = 值
/*      int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        boolean stuSex = s.sex;
        String stuAddr = s.address;
        System.out.println("学号 = " + s.no);
        System.out.println("姓名 = " + s.name);
        System.out.println("年龄 = " + s.age);
        System.out.println("性别 = " + s.sex);
        System.out.println("住址 = " + s.address);
        */

        s.no = 10;
        s.name = "李丰豪";
        s.sex = true;
        s.age = 20;
        s.address = "深圳";
        System.out.println("学号 = " + s.no);
        System.out.println("姓名 = " + s.name);
        System.out.println("年龄 = " + s.age);
        System.out.println("性别 = " + s.sex);
        System.out.println("住址 = " + s.address);

        //再通过类实例化一个全新的对象
        //stu是一个引用
        //stu同时也是一个局部变量
        //Object01是变量的数据类型
        Object01 stu = new Object01();

        System.out.println(stu.no);//0
        System.out.println(stu.name);//null
        System.out.println(stu.sex);//false
        System.out.println(stu.address);//null
        System.out.println(stu.age);//0

        //编译报错，no这个实例变量不能直接采用"类名"的方式访问
        //因为no是实例变量，对象级别的变量，变量存储在javad对象的内部，必须先有对象
        //通过对象才能访问no这个实例变量，不能直接通过"类名"访问
        //System.out.println(Object.no);

    }
}
