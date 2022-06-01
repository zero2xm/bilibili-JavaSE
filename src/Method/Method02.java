package Method;

//例子

/*
        方法的调用不一定在main方法当中，可以在其它方法当中。
        只要是程序可以执行到的位置，都可以去调用其它方法。
 */

public class Method02 {
    public static void sum(int a,int b){
        System.out.println(a+b);

        //调用doSome方法
        Method02.doSome();
    }

    //主方法
    public static void main(String[] args) {
        //调用sum方法
        Method02.sum(1,2);

    }
    public static void doSome(){
        System.out.println("do some!");
    }



}
