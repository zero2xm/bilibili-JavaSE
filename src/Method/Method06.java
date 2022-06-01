package Method;
/*
            深入return语句

                * 带有return关键字的java语句只要执行，所在的方法执行结束。

                * 在"同一个作用域"当中，return语句下面不能编写任何代码，因为这些代码永远都执行不到。所以编译报错。
 */
public class Method06 {
    public static void main(String[] args) {
          //编译错误：调用方法，方法名后面有括号。
//        System.out.println(m);

          System.out.println(m());

    }
    //编译报错：缺少返回语句，以下程序编译器认为无法百分百保证"return 1;"会执行。
    /*
    public static int m(){
        int a = 10;
        if(a > 3){
            return 1;
        }
    }
     */

    //以下程序可以保证"return 1; 或 return 0;"执行。编译通过
/*    public static int m(){
        int a = 10;
        if (a > 3){
            return 1;
        }else {
            return 0;
        }
    }*/

    //可以，和以上方法完全相同
/*    public static int m(){
        int a= 10;
        if (a > 3){
            return 1;
        //这里不能编写代码，编译错误，因为无法访问的语句
          System.out.println("hello");
        }
        System.out.println("hello");
        return 0;
        //编译错误，无法访问的语句
          System.out.println("hello");
        }
*/
    public static int m(){
        return 10 > 3 ? 1 : 0;
    }



}
