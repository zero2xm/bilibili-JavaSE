package service;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class UserService {

    //李丰豪
    int no;
    int age;

    /**
     * 登陆方法
     * @param name 用户名
     * @param password 密码
     * @return true表示登陆成功，false表示登陆失败！
     */
    public boolean login(String name,String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    //可能还有一个同名login方法
    //java怎么区分一个方法，依靠方法名和参数列表
    public void login(int i) {

    }


    /**
     * 退出系统的方法
     */
    public void logout(){
        System.out.println("系统已经退出！");
    }
}
