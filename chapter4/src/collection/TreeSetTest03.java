package collection;

import java.util.TreeSet;

/**
 * @Description:
 * 对自定义类型来说，TreeSet可以排序吗？
 *      以下程序中对于Person类型来说，无法排序。因为没有指定Person对象之间的比较规则。
 *      谁大谁小并没有说明
 * @User:
 * @Date:
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        //创建TreeSet集合
        TreeSet<Person> persons = new TreeSet<>();
        //添加集合
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        //遍历
        for (Person p :
                persons) {
            System.out.println(persons);
        }
    }
}

class Person{
    int age;
    public Person(int age){
        this.age = age;
    }

    //重写toString()方法
    public String toString(){
        return "Person[age="+age+"]";
    }
}
