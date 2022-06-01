package collection;

import java.util.Properties;

/**
 * @Description:
 * 目前只需要掌握Properties属性类对象的相关方法即可。
 * Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型。
 * Properties被称为属性类对象。
 * Properties是线程安全的。
 * @User:
 * @Date:
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();

        //需要掌握Properties的两个方法，一个库，一个取。
        pro.setProperty("url","jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");

        //通过key获取value
        String url = pro.getProperty("fdsa");
        String driver = pro.getProperty("fdsa");
        String username = pro.getProperty("fdsa");
        String password = pro.getProperty("fdsa");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);

    }
}
