package Object;
/*
    每一个类中都可以编写主方法，但是一般情况下，一个系统只有一个入口，所以主方法一般写一个
 */

public class Object07 {
    public static void main(String[] args) {
        //创建对象，商品对象
        //iphone7局部变量
        //iphone7引用
        //iphone7变量中保存内存地址指向堆内存当中的商品对象
        Object06 iphone7 = new Object06();

        //访问实例变量的语法：引用.变量
        System.out.println("商品的编号："+iphone7.productNo);
        System.out.println("商品的单价："+iphone7.price);

        iphone7.productNo=111;
        iphone7.price=6800.0;
        System.out.println("商品的编号："+iphone7.productNo);
        System.out.println("商品的单价："+iphone7.price);

//        System.out.println(Object06.productNo);


    }

}
