package IDE;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String addr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Customer() {
    }

    public Customer(int i) {
        System.out.println("带有int类型参数的构造器");
    }

    public Customer(String name) {
        System.out.println("带有String类型的构造器");
    }

    public Customer(int i, String name) {
        System.out.println("带有int,String类型的构造器");
    }
}
