package Object;


/*
        需求：
            定义一个学生类
                * 姓名
                * 学号
                * 学生有一台笔记本电脑
            定义一个计算机类【电脑/笔记本】，计算机有哪些属性：
                * 品牌
                * 型号
                * 颜色
            请编写程序来表示以上的类，然后分别将类创建为对象，
            对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑。
            然后编译并运行，并且这个执行过程采用图形的方式描述出来。
 */
//计算机类
class Computer{
    String brand;
    String style;
    String color;

}
//学生类
class Student{
    int no;
    String name;
    Computer macbook;

}
//测试类
public class Object05 {
    public static void main(String[] args) {
        //创建笔记本电脑对象
        Computer noteBook = new Computer();
        //不采用系统默认值
        //手动赋值
        noteBook.brand = "mac";
        noteBook.color = "white";
        noteBook.style = "air";

        //创建学生对象
        Student zs = new Student();
        zs.name ="张三";
        zs.no =123;
        zs.macbook = noteBook;

        //让这个学生和笔记本对象产生关系【通过学生能找到它的笔记本电脑】
        //想知道张三的笔记本的品牌
        System.out.println(zs.macbook.brand);

        //修改品牌
        zs.macbook.brand="air";
        System.out.println(zs.macbook.brand);

        //新电脑
        zs.macbook = new Computer();
        System.out.println(zs.macbook.brand);//null

    }
}
