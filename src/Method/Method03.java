package Method;

//方法调用的时候实参和形参要求个数对应相同，数据类型对应相同。
//类型不同的时候要求能够进行相应的自动类型转换

public class Method03 {
    public static void main(String[] args) {

        //编译错误：参数数量不同
//        Method03.sum();

        //编译错误：实参和形参的类型不是对应相同的
//        Method03.sum(true,flase);

        //可以
        Method03.sum(10L,20L);

        //存在自动类型转换：int-->long
        Method03.sum(10,20);

        //编译错误：参数类型不是对应相同的。
//        Method03.sum(3.0,20);

        //可以
        Method03.sum((long)3.0,20);//强制类型转换
    }

    public static void sum(long a,long b){
        System.out.println(a+b);
    }
}
