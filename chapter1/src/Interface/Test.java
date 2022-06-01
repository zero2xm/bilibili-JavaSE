package Interface;
//接口A和接口B虽然没有继承关系，但是写代码的时候，可以互转。
//编译器每一件。但是运行时可能出现ClassCastException。
public class Test {
    public static void main(String[] args) {
        A a = new D();
        B b = new D();
        C c = new D();

        //编译没问题，运行也没问题。
        B b2 = (B) a;
        b2.m2();

        M m = new E();
        // 经过测试：接口接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
        // 但是一定注意，运行时可能会出现ClassCastException异常。
        //编译没问题，运行有问题。
        K k = (K)m;
    }
}
