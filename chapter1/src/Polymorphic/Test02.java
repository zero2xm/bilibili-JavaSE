package Polymorphic;

public class Test02 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int retValue = sumInt(i,j);
        System.out.println(retValue);
    }

    private static int sumInt(int i, int j) {
        int c = i + j;
        int b = 15;
        int result = divede(c,b);
        return 0;
    }

    private static int divede(int c, int b) {
        int a = c/b;
        return a;
    }
}
