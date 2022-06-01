package This;

import javax.xml.namespace.QName;

public class Customer {

    //姓名【堆内存的对象内部中存储，所以访问该数据的时候，必须先创建对象，通过引用式访问】
    String name;

    //构造方法
    public Customer() {
    }

    //不带有static关键字的一个方法
    //顾客购物的行为
    //每一个顾客购物最终的结果是不一样的
    //所以购物这个行为是属于对象级别的行为
    //由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须有"对象"参与。
    //重点：没有static关键字的方法被称为"实例方法"
    //重点：没有static关键字的变量被称为"实例变量"
    //注意：当一个行为/动作执行的过程当中是需要对象参与的，那么这个方法一定要定义为"实例方法"，不要带static关键字
    //以下方法定义为实例方法，因为每一个顾客在购物的时候，最终的结果是不同的。所以这个动作完成的时候必须由对象参与。
    public void shopping() {
        //当zs在购物的时候，输出：zs在购物
        //当ls在购物的时候，输出：ls在购物

        //由于name是一个实例变量，所以这个name访问的时候一定访问的是当前对象的name
        //所以多数情况下"this."是可以省略的
        System.out.println(name + "在购物");

        //完整手法
        //System.out.println(this.name+"在购物");
    }
    public static void doSome(){
        //这个执行过程中没有"当前对象"，因为带有static的方法是通过类名的方式访问的
        //或者说这个"上下文"当中没有"当前对象"，自然也不存在this(this代表的是当前正在执行这个动作的对象)

        //以下程序为什么编译错误呢？
        //doSome方法调用不是对象去调用，是一个类名去调用，执行过程当中没有"当前对象"
        //name是一个"实例变量"，以下代码的含义是：访问当前对象的name,没有当前对象自然也不能访问当前对象的name
        //System.out.println(name);

        //static的方法调用不需要对象，直接使用类名，
        //System.out.println(this);

    }
    public static void doTher(){
        //假设想访问name这个实例变量的话应该怎么做？
        //System.out.println(name);

        //可以采用以下方案，但是以下方案，绝对不是访问的当前对象的name
        //创建对象
        Customer c = new Customer();
        System.out.println(c.name);//这里访问的name是c引用指向对象的name
    }
}
