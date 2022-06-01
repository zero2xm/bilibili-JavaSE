package Overload;
/*
            方法重载的优点
            功能相似的时候，方法名可以相同，但是功能不同的时候，尽可能让两个方法名字不同
 */

public class Overload01 {
    public static void main(String[] args) {
        System.out.println(sum(1,1));
        System.out.println(sum(1L,2L));
        System.out.println(sum(1.0,2.0));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static long sum(long a,long b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
}
