package Interface;

public class Test01food {
    public static void main(String[] args) {
        //创建厨师对象
        Chef chef = new Chef();

        //创建顾客对象
        Customer customer = new Customer(chef);

        //顾客点菜
        customer.order();
    }
}
