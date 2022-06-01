package collection;

import java.util.Objects;

/**
 * @Description:
 * @User:
 * @Date:
 */
public class Student {
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    //equals(如果学生名字一样表示同一个学生)
    /*public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Student)) return false;
        if (obj == this) return true;
        Student s = (Student)obj;
        return this.name.equals(s.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
