package IDE;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();

        //私有的属性不能在外部直接访问，这就是封装
        //c.id =410;

        //操作入口变成了只能通过set和get方法进行访问
        //在set方法和get方法执行过程中可以进行安全过滤。
        c.setId(100);
        c.setName("Lfh");
        c.setAge(26);
        c.setAddr("运城");

        System.out.println(c.getAddr());
        System.out.println(c.getAge());
        System.out.println(c.getName());
        System.out.println(c.getId());

    }
}
