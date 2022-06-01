package Interface;

public class AnimalTest {
    public static void main(String[] args) {
        // 创建对象
        Flyable f = new Cat();
        f.fly();

        Flyable f2 = new Pig();
        f2.fly();

        Flyable f3 = new Fish();
        f3.fly();
    }
}
