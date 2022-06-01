package Equals;

/**
 * @Description：重写equals方法
 * @User：
 * @Date：
 */
public class Student {
    //学号
    int no;//基本数据类型，比较时使用"=="
    //所在学校
    String school;//引用数据类型比较时使用equals()方法

    public Student() {
    }

    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }

    @Override
    //重写toString方法
    public String toString() {
        return "学号" + no + "，所在学校名称" + school;
    }

    //重写equals方法
    //当一个学生的学号相等，并且学校相同时，表示同一个学生
    //equals方法的编写模式都是固定的。架子差不多
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) return false;
        if (this == obj) return true;
        Student s = (Student)obj;
        return this.no == s.no && this.school.equals(s.school);

        //字符串用双等号比较可以吗？
        //不可以
        //return this.no == s.no && this.school == s.school;
    }
}
