package Assignments;

public class 九九乘法表 {
    public static void main(String[] args) {
        for(int x=1;x<=9;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x + "*" + y + "=" + x*y + "\t");
            }
            System.out.println();
        }
    }
}
