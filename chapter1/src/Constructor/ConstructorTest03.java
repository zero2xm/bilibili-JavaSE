package Constructor;

import IDE.Customer;

// 支持多行同时编辑：块编辑alt+鼠标左键
public class ConstructorTest03 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
      System.out.println(c1.getId());
      System.out.println(c1.getAge());
      System.out.println(c1.getName());
      System.out.println(c1.getAddr());

      Customer c2 = new Customer();
      System.out.println(c2.getId());
      System.out.println(c2.getAge());
      System.out.println(c2.getName());
      System.out.println(c2.getAddr());
    }
}
