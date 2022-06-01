package This;

public class DateTest {
    public static void main(String[] args) {
        //创建日期对象1
        Date date1 = new Date();
        date1.print();

        //创建日期对象2
        Date date2 = new Date(2008, 8, 8);
        date2.print();
    }
}
