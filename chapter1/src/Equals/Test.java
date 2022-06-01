package Equals;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class Test {
    public static void main(String[] args){
        /*Student s1 = new Student(111,"外国语学院");
        Student s2 = new Student(111,"外国语学院");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true*/

        Student s1 = new Student(111,new String("外国语学院"));
        Student s2 = new Student(111,new String("外国语学院"));
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//false
    }
}
