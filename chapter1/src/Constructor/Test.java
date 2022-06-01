package Constructor;

//command+N选择Constructor 重构方法

public class Test {
    private int no;
    private String name;
    private String birth;

    //无参数构造器
    public Test() {
    }

    //有参数的构造器
    public Test(int a, String b, String c) {
        no = a;
        name = b;
        birth = c;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
