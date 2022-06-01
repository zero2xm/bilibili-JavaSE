package Polymorphic;

public class Test01 {
    public static void main(String[] args) {

        //以前编写的程序

        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();
        c1.catchMouse();

        Bird b1 = new Bird();
        b1.move();

        //使用多态语法机制

        /*
        1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
        2、Cat is a Animal
        3、new Cat（）创建的对象的类型是Cat，a2这个引用的数据类型是Animal，可见它们进行了类型转换
            子类型转换成父类型，称向上转型/upcasting，或者称为自动类型转换。
        4、java语言中允许这种语法：父类型引用指向子类型对象。
         */
        Animal a2 = new Cat();
        //Bird b2 = new Cat();//编译报错，因为两种类型之间不存在任何继承关系。无法向上或向下转型。

        //java程序永远分为编译阶段和运行阶段。

        //先分析编译j阶段，再分析运行阶段，编译无法通过，根本无法运行。

        //编译阶段编译器检查a2这个引用的数据类型为Aniaml，由于Animal.class，由于Animal.class
        //字节码当中有move（）方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定。
        //只有静态绑定成功之后才有后续的运行。

        //在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序在运行阶段一定会调用
        //cat对象的move（）方法，此时发生了程序的动态绑定，运行阶段绑定。

        //无论是Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为
        //底层真实对象就是Cat对象。

        //父类型引用指向子类型对象这种机制导致程序在编译阶段的绑定和运行阶段的绑定两种不同的形态/状态。
        //这种机制可以成为一种多态语法机制。

        a2.move();//猫在走猫步！

        //分析以下程序为什么不能调用？
        //因为编译阶段编译器检查到a2的类型是Animal类型
        //从Animal.class字节码文件当中查找catchMouse（）方法
        //最终没有找到该方法，导致静态绑定失败，没有绑定成功，也就是说编译失败了，别谈运行了。

        //a2.catchMouse();

        /*
            需求：
                假设想让以上的对象执行catchMouse()方法，怎么办？
                    a2是无法直接调用的，因为a2的类型Animal，Animal中没有catchMouse()方法。
                    我们可以将a2强制类型转换为Cat类型。
                    a2的类型是Animal(父亲)，转换称Cat类型(子类)，被称为向下转型/downcasting/强制类型转换。
                注：向下转型也需要两种类型之间必须有继承关系，不然编译报错。强制类型转换需要加强类型转换符。

                什么时候使用向下转型呢？
                    当调用的方法或者访问的属性是子类型中特有的，在父类型当中不存在。
                    必须进行向下转型
         */
        Cat c2 = (Cat)a2;
        c2.catchMouse();

        //long x = 100L;
        //int i = (int)x;

        //父类型引用指向子类型【多态】
        Animal a3 = new Bird();

        //以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
        //Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型
        //父类型转换成子类型叫做向下转型，语法合格。

        //程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存当中真实存在的对象是Bird类型，Bird类型无法转换成Cat类型，
        //因为两种类型之间不存在任何继承关系，此时出现了著名的异常：
            //java.lang.classCastException
            //类型转换异常，这种异常总是在"向下类型"的时候会发生。
        //Cat c3 = (Cat)a3;

        //以上异常只有在强制类型转换的时候会发生，也就是说"向下转型"存在隐患(编译过了，但是运行错了！)
        //向上转型只要编译通过，运行一定不会出问题。Animal a = new Cat()
        //向下转型编译通过，运行可能错误：Animal a3 = new Bird();  Cat c3 = (Cat)a3;
        //怎么避免向下转型的classCastException呢？
                //使用instanceof运算符可以避免出现以上的异常
        //instanceof运算符怎么用？
                //语法格式:
                    //(引用 instanceof 数据类型名)
                    //以上运算符的执行结果是布尔类型，结果可能是true/false
                    //关于运算结果true/false：
                        //假设：(a instanceof Animal)
                        //true表示：
                            //a这个引用指向的对象是一个Animal类型。
                        //false表示：
                            //a这个引用的对象不是一个Animal类型
        //Java规范中要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免classCastException

        //当a3引用指向的对象确实是一个Cat的时候
        if (a3 instanceof Cat){//a3是一个Cat类型的对象
            Cat c3 = (Cat)a3;
            //调用子类当中特有的方法
            c3.catchMouse();
        }else if (a3 instanceof Bird){//a3是一个Bird类型的对象
            Bird b2 = (Bird)a3;
            //调用子类当中特有的方法
            b2.fly();
        }

    }
}
