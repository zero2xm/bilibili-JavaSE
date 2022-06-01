package Object;


public class Object03 {
    public static void main(String[] args) {

        //创建User对象
        User u = new User();

        //输出USer对象内部实例变量的值
/*        System.out.println(u.no);//0
        System.out.println(u.name);//null
        System.out.println(u.addr);//null*/

        //修过User对象内部实例变量的值
        u.no = 27;
        u.name = "李丰豪";//"李丰豪"属于java对象，属于String对象
        u.addr = new Address();
        u.addr.city = "运城";
        u.addr.street = "机场大道";
        u.addr.zipcode = "472000";

        //在main方法当中目前只能看到一个引用"u"
        //一切都是只能通过u来进行访问
        System.out.println(u.name + "居住在哪个城市:" + u.addr.city);
        System.out.println(u.name + "居住在哪个街道:" + u.addr.street);
        System.out.println(u.name + "邮编:" + u.addr.zipcode);

    }
}
