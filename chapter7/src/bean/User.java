package bean;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class User {
    public User() {
        System.out.println("无参数构造方法!");
    }

    //定义了有参数的构造方法，无参数构造方法就没了
    public User(String s){

    }
    public User(String...args){
        System.out.println("啊啊啊");
    }
}
