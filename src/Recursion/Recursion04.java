package Recursion;
/*
        先不使用递归，计算n的阶乘
        5的阶乘：

 */
/*public class Recursion04 {
    public static void main(String[] args) {
        int n = 5;
        int retValue = Mthod(n);
        System.out.println(retValue);

    }
    public static int Mthod(int n){
        int result = 1;
        for (int i = n;i<=5;i--){
            result *= i;
        }
        return result;
    }
}*/

//递归方式
public class Recursion04 {
    public static void main(String[] args) {
        int n = 5;
        int retValue = Mthod(n);
        System.out.println(retValue);

    }
    public static int Mthod(int n){
        if (n==1){
        }
        return n * Mthod(n-1);
    }
}
