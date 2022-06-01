package Recursion;
/*
        不使用递归，计算1～N的求和
 */
public class Recursion02 {
    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println(sum);
    }
    public static int sum(int n){
        int result = 0;
        for (int i=1;i<=n;i++){
            result +=i;
        }
        return result;
    }
}
