package Equals;

/**
 * @Description：equals方法重写要彻底。
 * @User：
 * @Date：
 */
public class Test02 {
    public static void main(String[] args){
        User u1 = new User("zs",new Address("运城","盐湖区","472000"));
        User u2 = new User("zs",new Address("运城","盐湖区","472000"));
        System.out.println(u1.equals(u2));//true

        User u3 = new User("zs",new Address("运城","河津市","472000"));
        System.out.println(u1.equals(u3));
    }
}
