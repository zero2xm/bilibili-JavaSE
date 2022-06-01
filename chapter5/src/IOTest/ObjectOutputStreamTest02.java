package IOTest;

import bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 *
 * 一次序列化多个对象呢？
 *      可以，可以将对象放到集合当中，序列化集合
 *
 * @User:
 * @Date:
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        //序列化一个集合,这个集合对象中放了很多其它对象
        oos.writeObject(userList);

        oos.flush();
        oos.close();
    }
}
