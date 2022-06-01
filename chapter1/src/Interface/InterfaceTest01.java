package Interface;

public class InterfaceTest01 {
    public static void main(String[] args) {
        //能使用多态吗？可以
        MyMAth mm = new MyMathImpl();
        int result1 = mm.sum(10,20);
        System.out.println(result1);

        int result2 = mm.sub(20,10);
        System.out.println(result2);
    }
}

//编写一个类

