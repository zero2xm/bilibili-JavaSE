package reflect;

import service.UserService;

import java.lang.reflect.Method;

/**
 * @Description:
 *
 * 重点:通过反射机制怎么调用一个对象的方法
 *
 * 反射机制，让代码很具有通用型，可变化的内容都是写到配置文件当中，将来修改配置文件之后，创建的对象不一样了，调用的方法也不同了，
 * 但是java代码不需要做任何改动，这就是反射机制的魅力。
 *
 * @User:
 * @Date:
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制，怎么调用方法
        //创建对象
        UserService userService = new UserService();
        //调用方法
        /*
        要素分析:
            要素1:对象userService
            要素2:login方法名
            要素3:实际参数列表
            要素4:返回值
         */
        boolean loginSuccess = userService.login("admin","123");
        //System.out.println(loginSuccess);
        System.out.println(loginSuccess ? "登陆成功" : "登陆失败！");

        //使用反射机制来调用一个对象的方法该怎么做
        Class userServiceClass = Class.forName("service.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login",String.class,String.class);
        //Method loginMethod = userServiceClass.getDeclaredMethod("login",int.class);
        //调用方法
        //调用方法有几个要素？也需要4要素。
        //反射机制中最重要的一个方法，必须记住。
        //四要素:
        /*
        loginMethod方法
        obj对象
        "admin","123"实参
        retValue 返回值
         */
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);

    }
}
