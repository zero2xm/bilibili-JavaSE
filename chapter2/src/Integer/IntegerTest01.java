package Integer;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class IntegerTest01 {

    //入口
    public static void main(String[] args) {
        //需求：调用doSome()方法是传一个数字进去
        //但是数字属于基本数据类型，而doSome()方法参数的类型是Object
        //可见doSome()方法无法接收基本数据类型的数字。那怎么办呢？可以传一个数字对应的包装类进去。

        //把100这个数字经过构造方法包装成对象。
        MyInt myInt = new MyInt(100);
        //doSome()方法虽然不能直接传100，但是可以传一个100对应的包装类型。
        doSome(myInt);
    }

    public static void doSome(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}
