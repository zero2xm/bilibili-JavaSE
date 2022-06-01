package Equals;

/**
 * @Description：
 * @User：
 * @Date：
 */
public class User {
    //用户名
    String name;
    //用户地址
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    //重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户。
    //这个equals判断的是User对象和User对象是否相等。
    @Override
    public boolean equals(Object o) {
        //用户名和用户名相同，住址和住址相同的时候，认定是同一个用户
        if (o == null || !(o instanceof User)) return false;
        if (this == o) return true;
        User u = (User)o;
        if (this.name.equals(u.name) && this.addr.equals(u.addr)){
            return true;
        }
        return false;
    }
}
