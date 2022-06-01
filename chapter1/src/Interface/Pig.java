package Interface;

class Pig extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是一只会飞的猪！！！");
    }
}
